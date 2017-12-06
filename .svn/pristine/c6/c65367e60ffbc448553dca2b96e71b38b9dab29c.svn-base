package com.api.order.row.rm.schema.update.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.order.row.rm.schema.update.dao.BuildOrderRowRmSchemaHelper;
import com.api.order.row.rm.schema.update.dao.RmDynamicSchemaUpdateDaoImpl;
import com.tayyarah.bus.entity.BusOrderRow;
import com.tayyarah.car.entity.CarOrderRow;
import com.tayyarah.common.entity.RmConfigModel;
import com.tayyarah.common.util.TravelCode;
import com.tayyarah.flight.entity.FlightOrderRow;
import com.tayyarah.hotel.entity.HotelOrderRow;
import com.tayyarah.insurance.entity.InsuranceOrderRow;
import com.tayyarah.misellaneous.entity.MiscellaneousOrderRow;
import com.tayyarah.train.entity.TrainOrderRow;
import com.tayyarah.visa.entity.VisaOrderRow;

@RestController
@RequestMapping(value="/update")
public class RmDynamicSchemaUpdateController {
	public static final Logger logger = Logger.getLogger(RmDynamicSchemaUpdateController.class);
	@Autowired
	RmDynamicSchemaUpdateDaoImpl  rmDynamicSchemaUpdateDaoImpl;
	@RequestMapping(value="/dynamicSchema")
	public  String  updateRmDynamicSchema(@RequestParam int  serviceCode){
		String msg="";
		List<RmConfigModel>  rmList=rmDynamicSchemaUpdateDaoImpl.getCompanyRmList();
		List<String> companyIds=new ArrayList<>();
		Map<String,String>  rmComapnyMap=new HashMap<>();
		for(RmConfigModel rm:rmList) 
			if(rm!=null){
				companyIds.add(String.valueOf(rm.getCorporateId()));
				rmComapnyMap.put(String.valueOf(rm.getCorporateId()), rm.getDynamicFieldsData());
			}
		if(rmList!=null && rmList.size()>0){
			switch(serviceCode){
			case  TravelCode.FLIGHT:
				List<FlightOrderRow> flightOrderRowList=BuildOrderRowRmSchemaHelper.buildFlightOrderRowRmSchemaList(rmDynamicSchemaUpdateDaoImpl.getFlightOrderRowList(companyIds), rmComapnyMap);
				if(rmDynamicSchemaUpdateDaoImpl.getFlightOrderRowUpdate(flightOrderRowList))
					msg="Flight rmConfig dynamic schema updated successfully";
				break;

			case  TravelCode.HOTEL:
				List<HotelOrderRow> hotelOrderRowList=BuildOrderRowRmSchemaHelper.buildHotelOrderRowRmSchemaList(rmDynamicSchemaUpdateDaoImpl.getHotelOrderRowList(companyIds), rmComapnyMap);
				if(rmDynamicSchemaUpdateDaoImpl.getHotelOrderRowUpdate(hotelOrderRowList))
					msg="Hotel rmConfig dynamic schema updated successfully";
				break;
			case  TravelCode.BUS:
				List<BusOrderRow> busOrderRowList=BuildOrderRowRmSchemaHelper.buildBusOrderRowRmSchemaList(rmDynamicSchemaUpdateDaoImpl.getBusOrderRowList(companyIds), rmComapnyMap);
				if(rmDynamicSchemaUpdateDaoImpl.getBusOrderRowUpdate(busOrderRowList))
					msg="Bus rmConfig dynamic schema updated successfully";
				break;
			case  TravelCode.CAR:
				List<CarOrderRow> carOrderRowList=BuildOrderRowRmSchemaHelper.buildCarOrderRowRmSchemaList(rmDynamicSchemaUpdateDaoImpl.getCarOrderRowList(companyIds), rmComapnyMap);
				if(rmDynamicSchemaUpdateDaoImpl.getCarOrderRowUpdate(carOrderRowList))
					msg="Car rmConfig dynamic schema updated successfully";
				break;
			case  TravelCode.TRAIN:
				List<TrainOrderRow> trainOrderRowList=BuildOrderRowRmSchemaHelper.buildTrainOrderRowRmSchemaList(rmDynamicSchemaUpdateDaoImpl.getTrainOrderRowList(companyIds), rmComapnyMap);
				if(rmDynamicSchemaUpdateDaoImpl.getTrainOrderRowUpdate(trainOrderRowList))
					msg="Train rmConfig dynamic schema updated successfully";
				break;

			case  TravelCode.VISA:
				List<VisaOrderRow> visaOrderRowList=BuildOrderRowRmSchemaHelper.buildVisaOrderRowRmSchemaList(rmDynamicSchemaUpdateDaoImpl.getVisaOrderRowList(companyIds), rmComapnyMap);
				if(rmDynamicSchemaUpdateDaoImpl.getVisaOrderRowUpdate(visaOrderRowList))
					msg="Visa rmConfig dynamic schema updated successfully";
				break;
			case  TravelCode.INSURANCE:
				List<InsuranceOrderRow> insuranceOrderRowList=BuildOrderRowRmSchemaHelper.buildInsuranceOrderRowRmSchemaList(rmDynamicSchemaUpdateDaoImpl.getInsuranceOrderRowList(companyIds), rmComapnyMap);
				if(rmDynamicSchemaUpdateDaoImpl.getInsuranceOrderRowUpdate(insuranceOrderRowList))
					msg="Insurance rmConfig dynamic schema updated successfully";
				break;
			case  TravelCode.MISCELLANEOUS:
				List<MiscellaneousOrderRow> miscellaneousOrderRowList=BuildOrderRowRmSchemaHelper.buildMiscellaneousOrderRowRmSchemaList(rmDynamicSchemaUpdateDaoImpl.getMiscellaneousOrderRowList(companyIds), rmComapnyMap);
				if(rmDynamicSchemaUpdateDaoImpl.getMiscellaneousOrderRowUpdate(miscellaneousOrderRowList))
					msg="Miscellaneous rmConfig dynamic schema updated successfully";
				break;
			default:
				break;
			}
		}
		return msg;
	}
}
