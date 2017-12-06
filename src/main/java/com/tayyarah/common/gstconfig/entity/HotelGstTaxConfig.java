package com.tayyarah.common.gstconfig.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tayyarah.common.util.Timestampable;


@Entity
@Table(name = "hotel_gst_tax_config")
public class HotelGstTaxConfig extends Timestampable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="applicable_fare")
	private String applicableFare;
	@Column(name="cgst", columnDefinition="decimal(20,3) default '0.000'")
	private BigDecimal CGST;
	@Column(name="sgst", columnDefinition="decimal(20,3) default '0.000'")
	private BigDecimal SGST;
	@Column(name="igst", columnDefinition="decimal(20,3) default '0.000'")
	private BigDecimal IGST;
	@Column(name="ugst", columnDefinition="decimal(20,3) default '0.000'")
	private BigDecimal UGST;
	@Column(name="intl_management_fee", columnDefinition="decimal(20,3) default '0.000'")
	private BigDecimal intlManagementFee;
	@Column(name="dom_management_fee", columnDefinition="decimal(20,3) default '0.000'")
	private BigDecimal domesticManagementFee;
	@Column(name="convenience_fee", columnDefinition="decimal(20,3) default '0.000'")
	private BigDecimal convenienceFee;	
	
	public BigDecimal getCGST() {
		return CGST;
	}
	public void setCGST(BigDecimal cGST) {
		CGST = cGST;
	}
	public BigDecimal getSGST() {
		return SGST;
	}
	public void setSGST(BigDecimal sGST) {
		SGST = sGST;
	}
	public BigDecimal getIGST() {
		return IGST;
	}
	public void setIGST(BigDecimal iGST) {
		IGST = iGST;
	}
	public BigDecimal getUGST() {
		return UGST;
	}
	public void setUGST(BigDecimal uGST) {
		UGST = uGST;
	}

	public BigDecimal getConvenienceFee() {
		return convenienceFee;
	}
	public void setConvenienceFee(BigDecimal convenienceFee) {
		this.convenienceFee = convenienceFee;
	}
	public String getApplicableFare() {
		return applicableFare;
	}
	public void setApplicableFare(String applicableFare) {
		this.applicableFare = applicableFare;
	}
	public BigDecimal getIntlManagementFee() {
		return intlManagementFee;
	}
	public BigDecimal getDomesticManagementFee() {
		return domesticManagementFee;
	}
	public void setIntlManagementFee(BigDecimal intlManagementFee) {
		this.intlManagementFee = intlManagementFee;
	}
	public void setDomesticManagementFee(BigDecimal domesticManagementFee) {
		this.domesticManagementFee = domesticManagementFee;
	}
}
