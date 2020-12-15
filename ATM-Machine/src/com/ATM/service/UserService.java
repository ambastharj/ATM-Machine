package com.ATM.service;

import com.ATM.dto.UserDto;
import com.ATM.service.helper.UserServiceHelper;

public class UserService {
	
	UserServiceHelper userServiceHelper;
	public String createUser(UserDto user) {
		userServiceHelper.createUser(user);
		return null;
	}
}
