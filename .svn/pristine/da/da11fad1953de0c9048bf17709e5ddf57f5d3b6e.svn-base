package com.api.order.row.rm.schema.update.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.tayyarah.bus.entity.BusOrderRow;
import com.tayyarah.car.entity.CarOrderRow;
import com.tayyarah.common.entity.RmConfigModel;
import com.tayyarah.flight.entity.FlightOrderRow;
import com.tayyarah.hotel.entity.HotelOrderRow;
import com.tayyarah.insurance.entity.InsuranceOrderRow;
import com.tayyarah.misellaneous.entity.MiscellaneousOrderRow;
import com.tayyarah.train.entity.TrainOrderRow;
import com.tayyarah.visa.entity.VisaOrderRow;

public class RmDynamicSchemaUpdateDaoImpl implements  RmDynamicSchemaUpdateDao{
	public static final Logger logger = Logger.getLogger(RmDynamicSchemaUpdateDaoImpl.class);
	@Autowired
	SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<RmConfigModel> getCompanyRmList() {
		// TODO Auto-generated method stub
		Session session=null;
		List<RmConfigModel> list=null;
		try{
			session=sessionFactory.openSession();
			Criteria criteria=session.createCriteria(RmConfigModel.class);
			list=criteria.list();
		}
		catch(HibernateException he){
			logger.error("HibernateException-------------"+he.getMessage());
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CarOrderRow> getCarOrderRowList(List<String> companyIds) {
		// TODO Auto-generated method stub
		Session session=null;
		List<CarOrderRow> list=null;
		try{
			session=sessionFactory.openSession();
			Criteria criteria=session.createCriteria(CarOrderRow.class);
			criteria.add(Restrictions.in("companyId", companyIds));
			list=criteria.list();
		}
		catch(HibernateException he){
			logger.error("HibernateException-------------"+he.getMessage());
		}
		return list;

	}
	@Override
	public  boolean getCarOrderRowUpdate(List<CarOrderRow> carOrderRowList) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction  tx=null;
		boolean isUpdated=false;
		try{
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			if(carOrderRowList!=null && carOrderRowList.size()>0) 
				for (int i = 0; i < carOrderRowList.size(); i++) {
					if(carOrderRowList.get(i)!=null){
						session.saveOrUpdate(carOrderRowList.get(i));
						if(i%30==0){
							session.flush();
							session.clear();
						}
					}
				}
			tx.commit();
			isUpdated=true;
		}
		catch(HibernateException he){
			if(tx!=null && tx.wasCommitted())
				tx.rollback();
			logger.error("HibernateException-------------"+he.getMessage());
		}
		finally{
			if(session!=null && session.isOpen()) 
				session.close();
		}
		return isUpdated;


	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BusOrderRow> getBusOrderRowList(List<String> companyIds) {
		// TODO Auto-generated method stub
		Session session=null;
		List<BusOrderRow> list=null;
		try{
			session=sessionFactory.openSession();
			Criteria criteria=session.createCriteria(BusOrderRow.class);
			criteria.add(Restrictions.in("companyId", companyIds));
			list=criteria.list();
		}
		catch(HibernateException he){
			logger.error("HibernateException-------------"+he.getMessage());
		}
		return list;
	}


	@Override
	public boolean  getBusOrderRowUpdate(List<BusOrderRow> busOrderRowList) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction  tx=null;
		boolean isUpdated=false;
		try{
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			if(busOrderRowList!=null && busOrderRowList.size()>0) 
				for (int i = 0; i < busOrderRowList.size(); i++) {
					if(busOrderRowList.get(i)!=null){
						session.saveOrUpdate(busOrderRowList.get(i));
						if(i%30==0){
							session.flush();
							session.clear();
						}
					}
				}
			tx.commit();
			isUpdated=true;

		}
		catch(HibernateException he){
			if(tx!=null && tx.wasCommitted())
				tx.rollback();
			logger.error("HibernateException-------------"+he.getMessage());
		}
		finally{
			if(session!=null && session.isOpen()) 
				session.close();
		}
		return isUpdated;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TrainOrderRow> getTrainOrderRowList(List<String> companyIds) {
		// TODO Auto-generated method stub
		Session session=null;
		List<TrainOrderRow> list=null;
		try{
			session=sessionFactory.openSession();
			Criteria criteria=session.createCriteria(TrainOrderRow.class);
			criteria.add(Restrictions.in("companyId", companyIds));
			list=criteria.list();
		}
		catch(HibernateException he){
			logger.error("HibernateException-------------"+he.getMessage());
		}
		return list;

	}

	@Override
	public boolean getTrainOrderRowUpdate(List<TrainOrderRow> trainOrderRowList) {
		Session session=null;
		Transaction  tx=null;
		boolean isUpdated=false;
		try{
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			if(trainOrderRowList!=null && trainOrderRowList.size()>0) 
				for (int i = 0; i < trainOrderRowList.size(); i++) {
					if(trainOrderRowList.get(i)!=null){
						session.saveOrUpdate(trainOrderRowList.get(i));
						if(i%30==0){
							session.flush();
							session.clear();
						}
					}
				}
			tx.commit();
			isUpdated=true;
		}
		catch(HibernateException he){
			if(tx!=null && tx.wasCommitted())
				tx.rollback();
			logger.error("HibernateException-------------"+he.getMessage());
		}
		finally{
			if(session!=null && session.isOpen()) 
				session.close();
		}
		return isUpdated;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<VisaOrderRow> getVisaOrderRowList(List<String> companyIds) {
		// TODO Auto-generated method stub
		Session session=null;
		List<VisaOrderRow> list=null;
		try{
			session=sessionFactory.openSession();
			Criteria criteria=session.createCriteria(VisaOrderRow.class);
			criteria.add(Restrictions.in("companyId", companyIds));
			list=criteria.list();
		}
		catch(HibernateException he){
			logger.error("HibernateException-------------"+he.getMessage());
		}
		return list;
	}

	@Override
	public boolean getVisaOrderRowUpdate(List<VisaOrderRow> visaOrderRowList) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction  tx=null;
		boolean isUpdated=false;
		try{
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			if(visaOrderRowList!=null && visaOrderRowList.size()>0) 
				for (int i = 0; i < visaOrderRowList.size(); i++) {
					if(visaOrderRowList.get(i)!=null){
						session.saveOrUpdate(visaOrderRowList.get(i));
						if(i%30==0){
							session.flush();
							session.clear();
						}
					}
				}
			tx.commit();
			isUpdated=true;
		}
		catch(HibernateException he){
			if(tx!=null && tx.wasCommitted())
				tx.rollback();
			logger.error("HibernateException-------------"+he.getMessage());
		}
		finally{
			if(session!=null && session.isOpen()) 
				session.close();
		}
		return isUpdated;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<InsuranceOrderRow> getInsuranceOrderRowList(List<String> companyIds) {
		// TODO Auto-generated method stub
		Session session=null;
		List<InsuranceOrderRow> list=null;
		try{
			session=sessionFactory.openSession();
			Criteria criteria=session.createCriteria(InsuranceOrderRow.class);
			criteria.add(Restrictions.in("companyId", companyIds));
			list=criteria.list();
		}
		catch(HibernateException he){
			logger.error("HibernateException-------------"+he.getMessage());
		}
		return list;
	}

	@Override
	public boolean getInsuranceOrderRowUpdate(List<InsuranceOrderRow> insuranceOrderRowList) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction  tx=null;
		boolean isUpdated=false;
		try{
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			if(insuranceOrderRowList!=null && insuranceOrderRowList.size()>0) 
				for (int i = 0; i < insuranceOrderRowList.size(); i++) {
					if(insuranceOrderRowList.get(i)!=null){
						session.saveOrUpdate(insuranceOrderRowList.get(i));
						if(i%30==0){
							session.flush();
							session.clear();
						}
					}
				}
			tx.commit();
			isUpdated=true;
		}
		catch(HibernateException he){
			if(tx!=null && tx.wasCommitted())
				tx.rollback();
			logger.error("HibernateException-------------"+he.getMessage());
		}
		finally{
			if(session!=null && session.isOpen()) 
				session.close();
		}
		return isUpdated;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MiscellaneousOrderRow> getMiscellaneousOrderRowList(List<String> companyIds) {
		// TODO Auto-generated method stub
		Session session=null;
		List<MiscellaneousOrderRow> list=null;
		try{
			session=sessionFactory.openSession();
			Criteria criteria=session.createCriteria(MiscellaneousOrderRow.class);
			criteria.add(Restrictions.in("companyId", companyIds));
			list=criteria.list();
		}
		catch(HibernateException he){
			logger.error("HibernateException-------------"+he.getMessage());
		}
		return list;
	}

	@Override
	public boolean getMiscellaneousOrderRowUpdate(List<MiscellaneousOrderRow> miscellaneousOrderRowList) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction  tx=null;
		boolean isUpdated=false;
		try{
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			if(miscellaneousOrderRowList!=null && miscellaneousOrderRowList.size()>0) 
				for (int i = 0; i < miscellaneousOrderRowList.size(); i++) {
					if(miscellaneousOrderRowList.get(i)!=null){
						session.saveOrUpdate(miscellaneousOrderRowList.get(i));
						if(i%30==0){
							session.flush();
							session.clear();
						}
					}
				}
			tx.commit();
			isUpdated=true;
		}
		catch(HibernateException he){
			if(tx!=null && tx.wasCommitted())
				tx.rollback();
			logger.error("HibernateException-------------"+he.getMessage());
		}
		finally{
			if(session!=null && session.isOpen()) 
				session.close();
		}
		return isUpdated;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FlightOrderRow> getFlightOrderRowList(List<String> companyIds) {
		// TODO Auto-generated method stub
		Session session=null;
		List<FlightOrderRow> list=null;
		try{
			session=sessionFactory.openSession();
			Criteria criteria=session.createCriteria(FlightOrderRow.class);
			criteria.add(Restrictions.in("companyId", companyIds));
			list=criteria.list();
		}
		catch(HibernateException he){
			logger.error("HibernateException-------------"+he.getMessage());
		}
		return list;
	}

	@Override
	public boolean getFlightOrderRowUpdate(List<FlightOrderRow> flightOrderRowList) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction  tx=null;
		boolean isUpdated=false;
		try{
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			if(flightOrderRowList!=null && flightOrderRowList.size()>0) 
				for (int i = 0; i < flightOrderRowList.size(); i++) {
					if(flightOrderRowList.get(i)!=null){
						session.saveOrUpdate(flightOrderRowList.get(i));
						if(i%30==0){
							session.flush();
							session.clear();
						}
					}
				}
			tx.commit();
			isUpdated=true;
		}
		catch(HibernateException he){
			if(tx!=null && tx.wasCommitted())
				tx.rollback();
			logger.error("HibernateException-------------"+he.getMessage());
		}
		finally{
			if(session!=null && session.isOpen()) 
				session.close();
		}
		return isUpdated;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HotelOrderRow> getHotelOrderRowList(List<String> companyIds) {
		// TODO Auto-generated method stub
		Session session=null;
		List<HotelOrderRow> list=null;
		try{
			session=sessionFactory.openSession();
			Criteria criteria=session.createCriteria(HotelOrderRow.class);
			criteria.add(Restrictions.in("companyId", companyIds));
			list=criteria.list();
		}
		catch(HibernateException he){
			logger.error("HibernateException-------------"+he.getMessage());
		}
		return list;
	}

	@Override
	public boolean getHotelOrderRowUpdate(List<HotelOrderRow> hotelOrderRowList) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction  tx=null;
		boolean isUpdated=false;
		try{
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			if(hotelOrderRowList!=null && hotelOrderRowList.size()>0) 
				for (int i = 0; i < hotelOrderRowList.size(); i++) {
					if(hotelOrderRowList.get(i)!=null){
						session.saveOrUpdate(hotelOrderRowList.get(i));
						if(i%30==0){
							session.flush();
							session.clear();
						}
					}
				}
			tx.commit();
			isUpdated=true;
		}
		catch(HibernateException he){
			if(tx!=null && tx.wasCommitted())
				tx.rollback();
			logger.error("HibernateException-------------"+he.getMessage());
		}
		finally{
			if(session!=null && session.isOpen()) 
				session.close();
		}
		return isUpdated;
	}

}
