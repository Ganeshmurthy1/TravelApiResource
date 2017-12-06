/**
@Author ilyas
05-10-2015 
UapiServiceCall.java
 */
/**
 * 
 */
package com.tayyarah.flight.util.api.bluestar;

import static javax.xml.bind.DatatypeConverter.printBase64Binary;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.log4j.Logger;

import com.tayyarah.apiconfig.model.BluestarConfig;
import com.tayyarah.common.dao.MoneyExchangeDao;
import com.tayyarah.common.entity.OrderCustomer;
import com.tayyarah.common.util.FileUtil;
import com.tayyarah.common.util.soap.SoapClient;
import com.tayyarah.email.dao.EmailDao;
import com.tayyarah.flight.dao.FlightBookingDao;
import com.tayyarah.flight.dao.FlightTempAirSegmentDAO;
import com.tayyarah.flight.entity.FlightAirPriceDetailsTemp;
import com.tayyarah.flight.entity.FlightOrderCustomer;
import com.tayyarah.flight.model.BluestarSearchData;
import com.tayyarah.flight.model.FlightBookingResponse;
import com.tayyarah.flight.model.FlightCustomerDetails;
import com.tayyarah.flight.model.FlightMarkUpConfig;
import com.tayyarah.flight.model.FlightPriceResponse;
import com.tayyarah.flight.model.Flightsearch;
import com.tayyarah.flight.model.PassengerDetails;
import com.tayyarah.flight.model.SearchFlightResponse;
import com.tayyarah.flight.service.db.FlightDataBaseServices;
import com.tayyarah.flight.util.api.travelport.FlightBookingResponseParser;
import com.tayyarah.user.entity.WalletAmountTranferHistory;


public class BluestarServiceCall {
	static final Logger logger = Logger.getLogger(BluestarServiceCall.class);



	public static SOAPMessage callService(SOAPMessage reqSoapMessage,
			BluestarConfig bluestarConfig)
					throws UnsupportedOperationException, SOAPException {
		String serviceURL = bluestarConfig.getUrl();
		SoapClient client = new SoapClient();
		return client.sendSoapMessage(reqSoapMessage, serviceURL);
	}

	public static SOAPMessage addSecureHeader(SOAPMessage reqsoapMessage,
			BluestarConfig bluestarConfig) throws SOAPException {
		String userName = "username";
		String password = "pass";
		String authorization = printBase64Binary(new String(userName + ":"
				+ password).toString().getBytes());
		String contentType = printBase64Binary(new String(
				"text/xml;charset=ISO-8859-1").toString().getBytes());
		reqsoapMessage.getMimeHeaders().addHeader("Authorization",
				"Basic " + authorization);
		reqsoapMessage.getMimeHeaders().addHeader("Content-Type", contentType);
		ByteArrayOutputStream in = new ByteArrayOutputStream();
		try {
			reqsoapMessage.writeTo(in);
			// System.out.println("soap header  :"+in);
		} catch (IOException e) {
			logger.error("IOException", e);
		} catch (SOAPException e) {
			logger.error("SOAPException", e);
		}
		return reqsoapMessage;
	}

	public static void createFlightCustomerDetails(FlightCustomerDetails FCD,
			Flightsearch flightsearch) {
		List<PassengerDetails> passengerdetailsList = new ArrayList<PassengerDetails>();
		buildPassengerDetails(passengerdetailsList, flightsearch);
		FCD.setPassengerdetailsList(passengerdetailsList);
	}

	private static void buildPassengerDetails(
			List<PassengerDetails> passengerdetailsList,
			Flightsearch flightsearch) {
		for (int i = 0; i < flightsearch.getAdult(); i++) {
			PassengerDetails passengerDetails = new PassengerDetails();
			passengerDetails.setPassengerId((new UID()).toString());
			passengerDetails.setPassengerTypeCode("ADT");
			passengerdetailsList.add(passengerDetails);
		}
		for (int i = 0; i < flightsearch.getKid(); i++) {
			PassengerDetails passengerDetails = new PassengerDetails();
			passengerDetails.setPassengerId((new UID()).toString());
			passengerDetails.setPassengerTypeCode("CHD");
			passengerdetailsList.add(passengerDetails);
		}
		for (int i = 0; i < flightsearch.getInfant(); i++) {
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

	public static SearchFlightResponse callSearchService(
			Flightsearch flightsearch,
			Map<String,List<FlightMarkUpConfig>> markupMap,
			Map<String, String> AirlineNameMap,
			ArrayList<Map<String, String>> MapList, MoneyExchangeDao moneydao,FlightTempAirSegmentDAO flightTempAirSegmentDAO,BluestarConfig bluestarConfig)
					throws Exception {
		StringBuilder requestData = BluestarGetFlightAvailibilityRequestBuilder.createSearchRequest(flightsearch,bluestarConfig);
		logger.info("requestData :" + requestData);
		SOAPMessage soapMessageReq = SoapClient.buildSoapMsgFromStr(requestData);
		/*editing by Manish*/
		String[] search_key=null;
		try{
			search_key = flightsearch.getTransactionKey().split(":");
		} catch (Exception e) {
			search_key=new UID().toString().split(":");
			e.printStackTrace();
		}
		try{
			FileUtil.writeSoap("flight", "bluestar", "search", false, requestData.toString(), String.valueOf(search_key[1]+search_key[2]));
		} catch (Exception e) {
			logger.error(" The filename, directory name ", e);
		}

		SOAPMessage soapMessageRes = callService(soapMessageReq,bluestarConfig);
		try{
			FileUtil.writeSoap("flight", "bluestar", "search", true, soapMessageRes,  String.valueOf(search_key[1]+search_key[2]));
		} catch (Exception e) {
			logger.error(" The filename, directory name ", e);
		}

		ByteArrayOutputStream flightSearchXMlDataStream = new ByteArrayOutputStream();
		try {
			soapMessageRes.writeTo(flightSearchXMlDataStream);
			logger.info("Search Response :" + flightSearchXMlDataStream);
		} catch (IOException e) {
			logger.error("IOException", e);
		}		
		SearchFlightResponse searchFlightResponse = null;
		BluestarSearchData  bluestarSearchData = BluestarGetFlightAvailabilityXMLObjectCoversion.createSearchFlightResponseFromXML(flightSearchXMlDataStream,flightsearch);	
		try {
			if(flightsearch.getTripType().equalsIgnoreCase("O") && !flightsearch.isDomestic())  {
				searchFlightResponse = BluestarGetFlightAvailabilityResponseParser
						.parseResponseOneway(bluestarSearchData, markupMap,
								flightsearch, AirlineNameMap, MapList,
								moneydao);

			}	if((flightsearch.getTripType().equalsIgnoreCase("O") && flightsearch.isDomestic()) || flightsearch.isSpecialSearch()) {
				searchFlightResponse = BluestarGetFlightAvailabilityResponseParser
						.parseResponseOnewayDomestic(bluestarSearchData, markupMap,
								flightsearch, AirlineNameMap, MapList,
								moneydao);
			}	if(flightsearch.getTripType().equalsIgnoreCase("R")) {
				searchFlightResponse = BluestarGetFlightAvailabilityResponseParser
						.parseResponseRoundTrip(bluestarSearchData, markupMap,
								flightsearch, AirlineNameMap, MapList,
								moneydao);
			}			

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}		
		try{
			/*Saving Bluestar Search Response in DB*/
			if(!flightsearch.isDynamicMarkup()){			
				if(flightsearch.isSpecialSearch()){
					FlightDataBaseServices dbService = new FlightDataBaseServices();
					byte[] FSR = null;
					try {
						FSR = FlightDataBaseServices.convertObjectToByteArray(bluestarSearchData);
					} catch (IOException e1) {					
						logger.error("IOException ",e1);
					}
					dbService.storeFlightSearchApiResponses(flightsearch.getSearchKey(), FSR, flightTempAirSegmentDAO,flightsearch,"BlueStar");
				}else if(!flightsearch.isSpecialSearch()){
					if(!(flightTempAirSegmentDAO.CheckSearchKeyExists(flightsearch.getSearchKey(),"BlueStar"))){					
						FlightDataBaseServices dbService = new FlightDataBaseServices();
						byte[] FSR = null;
						try {            			
							FSR = FlightDataBaseServices.convertObjectToByteArray(bluestarSearchData);
						} catch (IOException e1) {						
							logger.error("IOException ",e1);
						}
						dbService.storeFlightSearchApiResponses(flightsearch.getSearchKey(), FSR, flightTempAirSegmentDAO,flightsearch,"BlueStar");
					}
				}
				else{
					logger.info("Search Response not inserted");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}		
		return searchFlightResponse;
	}
}
