package com.ATM.dto;

import java.util.Date;

public class CurrencyCountDto {
	
	private int serialNumber;
	private int currencyType;
	private long availableNotes;
	private Date updateDateTime;
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public int getCurrencyType() {
		return currencyType;
	}
	public void setCurrencyType(int currencyType) {
		this.currencyType = currencyType;
	}
	
	public long getAvailableNotes() {
		return availableNotes;
	}
	public void setAvailableNotes(long availableNotes) {
		this.availableNotes = availableNotes;
	}
	
	public Date getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
}
