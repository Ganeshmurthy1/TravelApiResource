package com.tayyarah.esmart.bus.util;

import java.util.ArrayList;
import java.util.List;

import com.tayyarah.api.bus.esmart.model.ApiCancelConfirmation;
import com.tayyarah.bus.model.BusCancelRequest;

public class EsmartRequestBuilder {

	public static ApiCancelConfirmation getConfirmCancelTicketRequest(BusCancelRequest busCancelRequest,String apiConfirmationNo){
		ApiCancelConfirmation apiCancelConfirmation = new ApiCancelConfirmation();
		apiCancelConfirmation.setEtsTicketNo(apiConfirmationNo);
		List<String> seatList = new ArrayList<>();
		for (String seatno : busCancelRequest.getSeatNbr()) {
			seatList.add(seatno);
		}
		apiCancelConfirmation.setSeatNbrsToCancel(seatList);
		return apiCancelConfirmation;		
	}

}
