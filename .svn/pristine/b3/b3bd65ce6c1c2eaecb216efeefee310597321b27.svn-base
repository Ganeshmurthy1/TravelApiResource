package com.tayyarah.esmart.bus.util;

import java.math.BigDecimal;
import org.apache.log4j.Logger;

import com.tayyarah.api.bus.esmart.model.ApiCancelResponse;
import com.tayyarah.bus.entity.BusOrderRow;
import com.tayyarah.bus.model.BusCancelRequest;
import com.tayyarah.bus.model.BusCancelResponse;
import com.tayyarah.bus.model.Status;
import com.tayyarah.bus.util.BusErrorMessages;
import com.tayyarah.bus.util.BusException;
import com.tayyarah.bus.util.ErrorCodeCustomerEnum;

public class EsmartResponseParser {
	static final Logger logger = Logger.getLogger(EsmartBusConfig.class);
	
	
	public static BusCancelResponse cancellationResponseParser(ApiCancelResponse apiCancelResponse,BusCancelRequest busCancelRequest,BusOrderRow busOrderRow,BigDecimal totalAmtPaid,String EtsTicketNo){
		BusCancelResponse busCancelResponse = new BusCancelResponse();
		try{
			Status status = new Status();
			if(apiCancelResponse.getApiStatus().getSuccess()){
				status.setCode(Status.SUCCESSCODE);
				status.setMessage("Success");
				busCancelResponse.setApiPrice(new BigDecimal(apiCancelResponse.getTotalTicketFare()));
				busCancelResponse.setOrderid(busOrderRow.getOrderId());
				busCancelResponse.setTotalAmount(busOrderRow.getTotalAmount());
				busCancelResponse.setCancellationCharges(new BigDecimal(apiCancelResponse.getCancellationCharges()));
				busCancelResponse.setCancelChargesPercentage(apiCancelResponse.getCancelChargesPercentage());
				busCancelResponse.setIsPartiallyCancellable(apiCancelResponse.getPartiallyCancellable());
				busCancelResponse.setSearchkey(busCancelRequest.getSearchkey());
				busCancelResponse.setTotalAmountPaid(totalAmtPaid);
				busCancelResponse.setSeatNbr(busCancelRequest.getSeatNbr());
				busCancelResponse.setTransactionkey(busCancelRequest.getTransactionkey());
				busCancelResponse.setIsCancellable(apiCancelResponse.getCancellable());
				busCancelResponse.setTotalRefundAmount(new BigDecimal(apiCancelResponse.getTotalRefundAmount()));
				busCancelResponse.setApiConfirtmationNo(EtsTicketNo);
			}else{
				status.setCode(Status.FAILEDCODE);
				status.setMessage("failed to cancel the ticket");
			}
			busCancelResponse.setStatus(status);
			
		}catch(Exception e){
			throw new BusException(ErrorCodeCustomerEnum.Exception,BusErrorMessages.CANCELLATIONFAILED.getErrorMessage());
		}
		return busCancelResponse;
	}
}
