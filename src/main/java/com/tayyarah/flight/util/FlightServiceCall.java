package com.tayyarah.flight.util;

import static javax.xml.bind.DatatypeConverter.printBase64Binary;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.log4j.Logger;
import com.tayyarah.apiconfig.model.TravelportConfig;
import com.tayyarah.common.dao.MoneyExchangeDao;
import com.tayyarah.common.exception.ErrorCodeCustomerEnum;
import com.tayyarah.common.util.FileUtil;
import com.tayyarah.common.util.soap.MarshalUnmarshal;
import com.tayyarah.common.util.soap.SoapClient;
import com.tayyarah.flight.exception.FlightErrorMessages;
import com.tayyarah.flight.exception.FlightException;
import com.tayyarah.flight.model.FlightCustomerDetails;
import com.tayyarah.flight.model.FlightMarkUpConfig;
import com.tayyarah.flight.model.Flightsearch;
import com.tayyarah.flight.model.PassengerDetails;
import com.tayyarah.flight.model.SearchFlightResponse;
import com.tayyarah.flight.util.api.travelport.LowFareSearchRequestBuilder;
import com.tayyarah.flight.util.api.travelport.LowFareSearchResponseParser;
import com.travelport.api_v33.AirResponse.LowFareSearchRsp;


public class FlightServiceCall {
	static final Logger logger = Logger.getLogger(FlightServiceCall.class);

	public static SearchFlightResponse callSearchService(Flightsearch flightsearch, Map<String,List<FlightMarkUpConfig>> markupMap,Map<String, String>AirlineNameMap,ArrayList<Map<String,String>> MapList,boolean isDomestic, String airlineFromList,MoneyExchangeDao moneydao,TravelportConfig travelportConfig) throws Exception
	{
		StringBuilder requestData= LowFareSearchRequestBuilder.createSearchRequest(travelportConfig, flightsearch,airlineFromList);
		SOAPMessage soapMessageReq = SoapClient.buildSoapMsgFromStr(requestData);
		soapMessageReq = addSecureHeader(soapMessageReq, travelportConfig);
		SOAPMessage soapMessageRes=callService(soapMessageReq, travelportConfig);
		ByteArrayOutputStream in = new ByteArrayOutputStream();
		SearchFlightResponse searchFlightResponse = null;
		String transKey = flightsearch.getTransactionKey().replaceAll(":", "_");
		FileUtil.writeSoap("flight", "travelport", "SearchFlightResponse", false, requestData.toString(), transKey);

		try {
			soapMessageRes.writeTo(in);
			logger.info("Search Response :"+in);
			FileUtil.writeSoap("flight", "travelport", "SearchFlightResponse", true, new String(in.toByteArray(),"UTF-8"), transKey);

		} catch (IOException e) {
			logger.error("IOException",e);
		}
		LowFareSearchRsp lowFareSearchRsp;
		lowFareSearchRsp = null;
		try {
			MarshalUnmarshal marshalUnmarshal = new MarshalUnmarshal();
			lowFareSearchRsp=(LowFareSearchRsp)marshalUnmarshal.unMarshal(LowFareSearchRsp.class, soapMessageRes);
		}catch (JAXBException e) {
			logger.error("JAXBException", e);
			throw new FlightException(ErrorCodeCustomerEnum.JAXBException,
					FlightErrorMessages.NO_FLIGHT);
		} catch (Exception e) {
			logger.error("Exception", e);
			throw new FlightException(ErrorCodeCustomerEnum.Exception,
					FlightErrorMessages.NO_FLIGHT);
		}

		if(flightsearch.getTripType().equalsIgnoreCase("R")&&isDomestic){		
			searchFlightResponse= LowFareSearchResponseParser.parseResponseRoundTripWithSingleGroup(lowFareSearchRsp,markupMap,flightsearch,AirlineNameMap,MapList,moneydao);
		}else{
			searchFlightResponse= LowFareSearchResponseParser.parseResponseOnewayRound(lowFareSearchRsp,markupMap,flightsearch,AirlineNameMap,MapList,moneydao);
		}
		return searchFlightResponse;
	}


	
	public static SOAPMessage callService(SOAPMessage reqSoapMessage,TravelportConfig travelportConfig) throws UnsupportedOperationException, SOAPException {
		String serviceURL= travelportConfig.getUrl();
		SoapClient client = new SoapClient();
		return client.sendSoapMessage(reqSoapMessage, serviceURL);
	}
	public static SOAPMessage addSecureHeader(SOAPMessage reqsoapMessage,TravelportConfig travelportConfig)
	{
		String userName = travelportConfig.getUsername();
		String password = travelportConfig.getPassword();
		String authorization = printBase64Binary(new String(userName + ":" + password).toString().getBytes());
		String contentType = printBase64Binary(new String("text/xml;charset=ISO-8859-1").toString().getBytes());
		reqsoapMessage.getMimeHeaders().addHeader("Authorization", "Basic " + authorization);
		reqsoapMessage.getMimeHeaders().addHeader("Content-Type", contentType);
		ByteArrayOutputStream in = new ByteArrayOutputStream();
		try {
			reqsoapMessage.writeTo(in);
		} catch (IOException e) {
			logger.error("IOException",e);
		} catch (SOAPException e) {
			logger.error("SOAPException",e);
		}
		return	reqsoapMessage ;
	}
	public static void createFlightCustomerDetail(FlightCustomerDetails FCD,Flightsearch flightsearch) {
		List<PassengerDetails> passengerdetailsList=new ArrayList<PassengerDetails>();
		addPassengers(passengerdetailsList,flightsearch);
		FCD.setPassengerdetailsList(passengerdetailsList);
	}
	private static void addPassengers( List<PassengerDetails> passengerdetailsList,Flightsearch flightsearch){
		for(int i=0;i<flightsearch.getAdult();i++)
		{
			PassengerDetails passengerDetails = new PassengerDetails();
			passengerDetails.setPassengerId((new UID()).toString());
			passengerDetails.setPassengerTypeCode("ADT");
			passengerDetails.setBirthday("yyyy-mm-dd");
			passengerDetails.setNationalityCountry("IND");
			passengerDetails.setPassportIssuingCountry("IND");

			passengerdetailsList.add(passengerDetails);
		}
		for(int i=0;i<flightsearch.getKid();i++)
		{
			PassengerDetails passengerDetails = new PassengerDetails();
			passengerDetails.setPassengerId((new UID()).toString());
			passengerDetails.setPassengerTypeCode("CHD");

			passengerdetailsList.add(passengerDetails);
		}
		for(int i=0;i<flightsearch.getInfant();i++)
		{
			PassengerDetails passengerDetails = new PassengerDetails();
			passengerDetails.setPassengerId((new UID()).toString());
			passengerDetails.setPassengerTypeCode("INF");

			passengerdetailsList.add(passengerDetails);
		}
	}
	public static List<String> getfligtindexlist(String flightindex) {

		List<String> fligtindexlist = new ArrayList<String>();

		String Tempflightindex = flightindex;
		while (Tempflightindex.length() > 0) {
			if (Tempflightindex.indexOf("_") != -1) {
				String Newflightindex = Tempflightindex.substring(0,
						Tempflightindex.indexOf("_"));
				fligtindexlist.add(Newflightindex);
				Tempflightindex = Tempflightindex.substring(Newflightindex
						.length() + 1);
			} else {
				fligtindexlist.add(Tempflightindex);
				break;
			}

		}
		return fligtindexlist;
	}
	public static String getFlightIndex(List<String> fligtindexlist){
		StringBuffer newFlightIndex=new StringBuffer();

		for(int i=0;i<fligtindexlist.size();i++){

			String FI=fligtindexlist.get(i);

			newFlightIndex.append(FI.substring(3));
			if(i!=fligtindexlist.size()-1){
				newFlightIndex.append("_");
			}
		}
		return newFlightIndex.toString();
	}
}
