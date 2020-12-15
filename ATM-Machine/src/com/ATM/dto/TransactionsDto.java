package com.ATM.dto;

import java.util.Date;

public class TransactionsDto {
	
	private long transactionId;
	private String transactionType;
	private long userId;
	private Date createDateTime;
	
	public long getTransactionId() {
		return transactionId;
	}
//	public void setTransactionId(long transactionId) {
//		this.transactionId = transactionId;
//	}
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	
}
