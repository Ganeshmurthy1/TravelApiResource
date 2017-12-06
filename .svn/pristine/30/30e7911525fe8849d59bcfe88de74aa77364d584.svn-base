package com.api.order.row.rm.schema.update.dao;

import java.util.List;

import com.tayyarah.bus.entity.BusOrderRow;
import com.tayyarah.car.entity.CarOrderRow;
import com.tayyarah.common.entity.RmConfigModel;
import com.tayyarah.flight.entity.FlightOrderRow;
import com.tayyarah.hotel.entity.HotelOrderRow;
import com.tayyarah.insurance.entity.InsuranceOrderRow;
import com.tayyarah.misellaneous.entity.MiscellaneousOrderRow;
import com.tayyarah.train.entity.TrainOrderRow;
import com.tayyarah.visa.entity.VisaOrderRow;

public interface RmDynamicSchemaUpdateDao {
	public List<RmConfigModel> getCompanyRmList() ;
	public List<FlightOrderRow> getFlightOrderRowList(List<String> companyIds) ;
	public  boolean getFlightOrderRowUpdate(List<FlightOrderRow> flightOrderRowList) ;
	public List<HotelOrderRow> getHotelOrderRowList(List<String> companyIds) ;
	public  boolean getHotelOrderRowUpdate(List<HotelOrderRow> hotelOrderRowList) ;
	public List<CarOrderRow> getCarOrderRowList(List<String> companyIds) ;
	public  boolean getCarOrderRowUpdate(List<CarOrderRow> carOrderRowList) ;
	public List<BusOrderRow> getBusOrderRowList(List<String> companyIds);
	public boolean getBusOrderRowUpdate(List<BusOrderRow> busOrderRowList) ;
	public List<TrainOrderRow> getTrainOrderRowList(List<String> companyIds);
	public boolean getTrainOrderRowUpdate(List<TrainOrderRow> trainOrderRowList) ;
	public List<VisaOrderRow> getVisaOrderRowList(List<String> companyIds);
	public boolean getVisaOrderRowUpdate(List<VisaOrderRow> visaOrderRowList) ;
	public List<InsuranceOrderRow> getInsuranceOrderRowList(List<String> companyIds);
	public boolean getInsuranceOrderRowUpdate(List<InsuranceOrderRow> insuranceOrderRowList) ;
	public List<MiscellaneousOrderRow> getMiscellaneousOrderRowList(List<String> companyIds);
	public boolean getMiscellaneousOrderRowUpdate(List<MiscellaneousOrderRow> miscellaneousOrderRowList) ;
}
