package com.api.order.row.rm.schema.update.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.tayyarah.api.orderrow.rm.structure.BusOrderRowRmConfigStruct;
import com.tayyarah.api.orderrow.rm.structure.CarOrderRowRmConfigStruct;
import com.tayyarah.api.orderrow.rm.structure.FlightOrderRowRmConfigStruct;
import com.tayyarah.api.orderrow.rm.structure.HotelOrderRowRmConfigStruct;
import com.tayyarah.api.orderrow.rm.structure.InsuranceOrderRowRmConfigStruct;
import com.tayyarah.api.orderrow.rm.structure.MiscellaneousOrderRowRmConfigStruct;
import com.tayyarah.api.orderrow.rm.structure.TrainOrderRowRmConfigStruct;
import com.tayyarah.api.orderrow.rm.structure.VisaOrderRowRmConfigStruct;
import com.tayyarah.bus.entity.BusOrderRow;
import com.tayyarah.car.entity.CarOrderRow;
import com.tayyarah.flight.entity.FlightOrderRow;
import com.tayyarah.hotel.entity.HotelOrderRow;
import com.tayyarah.insurance.entity.InsuranceOrderRow;
import com.tayyarah.misellaneous.entity.MiscellaneousOrderRow;
import com.tayyarah.train.entity.TrainOrderRow;
import com.tayyarah.visa.entity.VisaOrderRow;

public class BuildOrderRowRmSchemaHelper {
	public static List<FlightOrderRow> buildFlightOrderRowRmSchemaList(List<FlightOrderRow> flightList,Map<String,String>  rmComapnyMap){
		List<FlightOrderRow> list=new ArrayList<>();
		if(flightList!=null && flightList.size()>0) 
			for(FlightOrderRow flightOrderRow :flightList)
				if(flightOrderRow!=null && flightOrderRow.getFlightOrderRowRmConfigStruct()!=null) 
					if(rmComapnyMap!=null && rmComapnyMap.size()>0 && rmComapnyMap.containsKey(flightOrderRow.getCompanyId())){
						FlightOrderRowRmConfigStruct flightOrderRowRmConfigStruct=new FlightOrderRowRmConfigStruct();
						flightOrderRowRmConfigStruct.setRmDynamicData(rmComapnyMap.get(flightOrderRow.getCompanyId()));
						flightOrderRow.setFlightOrderRowRmConfigStruct(flightOrderRowRmConfigStruct);
						list.add(flightOrderRow);
					}
		return list;

	}
	public static List<HotelOrderRow> buildHotelOrderRowRmSchemaList(List<HotelOrderRow> hotelList,Map<String,String>  rmComapnyMap){
		List<HotelOrderRow> list=new ArrayList<>();
		if(hotelList!=null && hotelList.size()>0) 
			for(HotelOrderRow hotelOrderRow :hotelList)
				if(hotelOrderRow!=null && hotelOrderRow.getHotelOrderRowRmConfigStruct()==null) 
					if(rmComapnyMap!=null && rmComapnyMap.size()>0 && rmComapnyMap.containsKey(hotelOrderRow.getCompanyId())){
						HotelOrderRowRmConfigStruct hotelOrderRowRmConfigStruct=new HotelOrderRowRmConfigStruct();
						hotelOrderRowRmConfigStruct.setRmDynamicData(rmComapnyMap.get(hotelOrderRow.getCompanyId()));
						hotelOrderRow.setHotelOrderRowRmConfigStruct(hotelOrderRowRmConfigStruct);
						list.add(hotelOrderRow);
					}
		return list;

	}
	public static List<CarOrderRow> buildCarOrderRowRmSchemaList(List<CarOrderRow> carList,Map<String,String>  rmComapnyMap){
		List<CarOrderRow> list=new ArrayList<>();
		if(carList!=null && carList.size()>0) 
			for(CarOrderRow carOrderRow:carList) 
				if(carOrderRow!=null && carOrderRow.getCarOrderRowRmConfigStruct()!=null) 
					if(rmComapnyMap!=null && rmComapnyMap.size()>0 && rmComapnyMap.containsKey(carOrderRow.getCompanyId())){
						CarOrderRowRmConfigStruct carOrderRowRmConfigStruct=new CarOrderRowRmConfigStruct();
						carOrderRowRmConfigStruct.setRmDynamicData(rmComapnyMap.get(carOrderRow.getCompanyId()));
						carOrderRow.setCarOrderRowRmConfigStruct(carOrderRowRmConfigStruct);
						list.add(carOrderRow);
					}

		return list;

	}

	public static List<BusOrderRow> buildBusOrderRowRmSchemaList(List<BusOrderRow> busList,Map<String,String>  rmComapnyMap){
		List<BusOrderRow> list=new ArrayList<>();
		if(busList!=null && busList.size()>0) 
			for(BusOrderRow busOrderRow:busList)
				if(busOrderRow!=null && busOrderRow.getBusOrderRowRmConfigStruct()!=null) 
					if(rmComapnyMap!=null && rmComapnyMap.size()>0 && rmComapnyMap.containsKey(busOrderRow.getCompanyId())){
						BusOrderRowRmConfigStruct busOrderRowRmConfigStruct=new BusOrderRowRmConfigStruct();
						busOrderRowRmConfigStruct.setRmDynamicData(rmComapnyMap.get(busOrderRow.getCompanyId()));
						busOrderRow.setBusOrderRowRmConfigStruct(busOrderRowRmConfigStruct);
						list.add(busOrderRow);
					}
		return list;

	}

	public static List<TrainOrderRow> buildTrainOrderRowRmSchemaList(List<TrainOrderRow> trainList,Map<String,String>  rmComapnyMap){
		List<TrainOrderRow> list=new ArrayList<>();
		if(trainList!=null && trainList.size()>0) 
			for(TrainOrderRow trainOrderRow:trainList)
				if(trainOrderRow!=null && trainOrderRow.getTrainOrderRowRmConfigStruct()!=null) 
					if(rmComapnyMap!=null && rmComapnyMap.size()>0 && rmComapnyMap.containsKey(trainOrderRow.getCompanyId())){
						TrainOrderRowRmConfigStruct trainOrderRowRmConfigStruct=new TrainOrderRowRmConfigStruct();
						trainOrderRowRmConfigStruct.setRmDynamicData(rmComapnyMap.get(trainOrderRow.getCompanyId()));
						trainOrderRow.setTrainOrderRowRmConfigStruct(trainOrderRowRmConfigStruct);
						list.add(trainOrderRow);
					}
		return list;

	}
	public static List<VisaOrderRow> buildVisaOrderRowRmSchemaList(List<VisaOrderRow> visaList,Map<String,String>  rmComapnyMap){
		List<VisaOrderRow> list=new ArrayList<>();
		if(visaList!=null && visaList.size()>0) 
			for(VisaOrderRow visaOrderRow:visaList)
				if(visaOrderRow!=null && visaOrderRow.getVisaOrderRowRmConfigStruct()!=null) 
					if(rmComapnyMap!=null && rmComapnyMap.size()>0 && rmComapnyMap.containsKey(visaOrderRow.getCompanyId())){
						VisaOrderRowRmConfigStruct visaOrderRowRmConfigStruct=new VisaOrderRowRmConfigStruct();
						visaOrderRowRmConfigStruct.setRmDynamicData(rmComapnyMap.get(visaOrderRow.getCompanyId()));
						visaOrderRow.setVisaOrderRowRmConfigStruct(visaOrderRowRmConfigStruct);
						list.add(visaOrderRow);
					}
		return list;

	}

	public static List<InsuranceOrderRow> buildInsuranceOrderRowRmSchemaList(List<InsuranceOrderRow> insuranceList,Map<String,String>  rmComapnyMap){
		List<InsuranceOrderRow> list=new ArrayList<>();
		if(insuranceList!=null && insuranceList.size()>0) 
			for(InsuranceOrderRow insuranceOrderRow:insuranceList)
				if(insuranceOrderRow!=null && insuranceOrderRow.getInsuranceOrderRowRmConfigStruct()!=null) 
					if(rmComapnyMap!=null && rmComapnyMap.size()>0 && rmComapnyMap.containsKey(insuranceOrderRow.getCompanyId())){
						InsuranceOrderRowRmConfigStruct insuranceOrderRowRmConfigStruct=new InsuranceOrderRowRmConfigStruct();
						insuranceOrderRowRmConfigStruct.setRmDynamicData(rmComapnyMap.get(insuranceOrderRow.getCompanyId()));
						insuranceOrderRow.setInsuranceOrderRowRmConfigStruct(insuranceOrderRowRmConfigStruct);
						list.add(insuranceOrderRow);
					}
		return list;

	}
	public static List<MiscellaneousOrderRow> buildMiscellaneousOrderRowRmSchemaList(List<MiscellaneousOrderRow> miscellaneousList,Map<String,String>  rmComapnyMap){
		List<MiscellaneousOrderRow> list=new ArrayList<>();
		if(miscellaneousList!=null && miscellaneousList.size()>0) 
			for(MiscellaneousOrderRow miscellaneousOrderRow:miscellaneousList)
				if(miscellaneousOrderRow!=null && miscellaneousOrderRow.getMiscellaneousOrderRowRmConfigStruct()!=null) 
					if(rmComapnyMap!=null && rmComapnyMap.size()>0 && rmComapnyMap.containsKey(miscellaneousOrderRow.getCompanyId())){
						MiscellaneousOrderRowRmConfigStruct miscellaneousOrderRowRmConfigStruct=new MiscellaneousOrderRowRmConfigStruct();
						miscellaneousOrderRowRmConfigStruct.setRmDynamicData(rmComapnyMap.get(miscellaneousOrderRow.getCompanyId()));
						miscellaneousOrderRow.setMiscellaneousOrderRowRmConfigStruct(miscellaneousOrderRowRmConfigStruct);
						list.add(miscellaneousOrderRow);
					}
		return list;

	}

}
