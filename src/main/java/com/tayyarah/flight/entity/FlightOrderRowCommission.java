package com.tayyarah.flight.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




	
	
	
	@Component
	@Scope("session")
	@Entity
	@Table(name = "flight_order_row_commission")
	@Proxy(lazy = false)
	public class FlightOrderRowCommission  implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		
	@Id
	@GeneratedValue
	Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_row_id", referencedColumnName = "id")
	private FlightOrderRow flightOrderRow;
	
	
	
	public FlightOrderRow getFlightOrderRow() {
		return flightOrderRow;
	}

	public void setFlightOrderRow(FlightOrderRow flightOrderRow) {
		this.flightOrderRow = flightOrderRow;
	}
	@Column(name="commission_amount_value")
	private BigDecimal commissionAmountValue;

	public BigDecimal getCommissionAmountValue() {
		return commissionAmountValue;
	}

	public void setCommissionAmountValue(BigDecimal commissionAmountValue) {
		this.commissionAmountValue = commissionAmountValue;
	}
	/*@Column(name="order_id")
	private String orderId;*/
	@Column(name="company_id")
	private String CompanyId;
	@Column(name="commission")
	private BigDecimal commission;
	@Column(name="iata_commission")
	private BigDecimal iataCommission;
	@Column(name="plb_commission")
	private BigDecimal plbCommission;
	@Column(name="commission_type")
	private String commissionType;
	@Column(name="rate_type")
	private String rateType;
	
	@Column(name="is_sheet_mode",columnDefinition="BIT(1) default 0")
	private boolean isSheetMode;
	public boolean isSheetMode() {
		return isSheetMode;
	}
	public void setSheetMode(boolean isSheetMode) {
		this.isSheetMode = isSheetMode;
	}

	
	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getCommissionType() {
		return commissionType;
	}

	public void setCommissionType(String commissionType) {
		this.commissionType = commissionType;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public String getCompanyId() {
		return CompanyId;
	}  

	public void setCompanyId(String companyId) {
		CompanyId = companyId;
	}

	public BigDecimal getPlbCommission() {
		return plbCommission;
	}

	public void setPlbCommission(BigDecimal plbCommission) {
		this.plbCommission = plbCommission;
	}

	public BigDecimal getIataCommission() {
		return iataCommission;
	}

	public void setIataCommission(BigDecimal iataCommission) {
		this.iataCommission = iataCommission;
	}


	/*public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}*/
}
