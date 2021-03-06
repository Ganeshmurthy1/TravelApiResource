package com.tayyarah.admin.analytics.lookbook.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : Manish Samrat
 * @createdAt : 12/07/2017
 * @version
 */
@Entity
@Table(name = "hotel_look")
public class HotelLook implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;

	@Column(name = "searchDate")
	Timestamp searchOnDateTime;
	private int companyId;
	@Column(name = "company_name")
	private String companyName;
	private String searchKey;
	private String transactionId;
	@Column(columnDefinition = "LONGTEXT")
	private String searchQueryString;
	private String appkey;
	private String IP;
	private int configId;

	public int getConfigId() {
		return configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	public long getId() {
		return id;
	}

	public Timestamp getSearchOnDateTime() {
		return searchOnDateTime;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public String getSearchQueryString() {
		return searchQueryString;
	}

	public String getAppkey() {
		return appkey;
	}

	public String getIP() {
		return IP;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSearchOnDateTime(Timestamp searchOnDateTime) {
		this.searchOnDateTime = searchOnDateTime;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public void setSearchQueryString(String searchQueryString) {
		this.searchQueryString = searchQueryString;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
