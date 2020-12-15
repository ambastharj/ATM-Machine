package com.ATM.dto;

import java.util.Date;

public class UserDto {
	
	private long userId;
	private String userName;
	private String firstName;
	private String lastName;
	private int pin;
	private String createDateTime;
	private String accountType;
	
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
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public String getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "User created successfully.." + "\n"
				+ "User Id         :  " + userId + "\n"
				+ "Username        :  " + userName + "\n"
				+ "First Name      :  " + firstName + "\n"
				+ "Last Name       :  " + lastName + "\n"
				+ "Creation Date   :  " + createDateTime + "\n"
				+ "Account Type    :  " + accountType + "\n";
	}
	
}
