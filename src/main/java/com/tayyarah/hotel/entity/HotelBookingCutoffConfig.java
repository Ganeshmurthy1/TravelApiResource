package com.tayyarah.hotel.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.tayyarah.common.util.DateConversion;
import com.tayyarah.common.util.Timestampable;

@Entity
@Table(name = "hotel_booking_cutoff_config")
public class HotelBookingCutoffConfig extends Timestampable implements Serializable {

	private static final long serialVersionUID = 1L;
	@Transient
	private String  tranCutoffDate;
	@Column(name = "cut_off_type")
	private String cutofftype;	
	@Column(name = "cut_off_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date cutoffDate;	
	@Column(name = "cut_off_week")
	private String cutoffweek;
	
	public String getCutoffweek() {
		return cutoffweek;
	}
	public void setCutoffweek(String cutoffweek) {
		this.cutoffweek = cutoffweek;
	}	
	public Date getCutoffDate() {
		return cutoffDate;
	}
	public void setCutoffDate(Date cutoffDate) {
		this.cutoffDate = cutoffDate;
	}
	public String getCutofftype() {
		return cutofftype;
	}
	public void setCutofftype(String cutofftype) {
		this.cutofftype = cutofftype;
	} 
	public String getTranCutoffDate() {
		if(getCutoffDate()!=null){			 
			tranCutoffDate = DateConversion.convertDateToStringToDate(getCutoffDate());
		}		 
		return tranCutoffDate;
	}
	public void setTranCutoffDate(String tranCutoffDate) {
		this.tranCutoffDate = tranCutoffDate;
	}

}