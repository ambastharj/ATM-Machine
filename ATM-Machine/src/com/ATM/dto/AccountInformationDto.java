package com.ATM.dto;

import java.util.Date;

public class AccountInformationDto {
	
	private long id;
	private long transactionId;
	private long userId;
	private String userName;
	private String firstName;
	private String lastName;
	private long availableBalance;
	private long lastBalance;
	private long creditAmount;
	private long debitAmount;
	private Date updateDateTime;
	
	public long getId() {
		return id;
	}
//	public void setId(long id) {
//		this.id = id;
//	}
	
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public long getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(long availableBalance) {
		this.availableBalance = availableBalance;
	}
	
	public long getLastBalance() {
		return lastBalance;
	}
	public void setLastBalance(long lastBalance) {
		this.lastBalance = lastBalance;
	}
	
	public long getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(long creditAmount) {
		this.creditAmount = creditAmount;
	}
	
	public long getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(long debitAmount) {
		this.debitAmount = debitAmount;
	}
	
	public Date getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
}
