package com.ATM.service.helper.impl;

import com.ATM.dao.UserDao;
import com.ATM.dao.Impl.UserDaoImpl;
import com.ATM.dto.UserDto;
import com.ATM.service.helper.UserServiceHelper;
import com.ATM.util.Constants;

public class UserServiceHelperImpl implements UserServiceHelper {

	UserDao user;
	UserDto userDto;
	
	@Override
	public String createUser(UserDto newUser) {
		
		String adminUser = Constants.ADMIN_USERNAME;
		if(newUser.getUserName().equalsIgnoreCase(adminUser)) {
			System.out.println("Cannot create user with this username.");
		}
		else {
			user = new UserDaoImpl();
			userDto = user.createUser(newUser);
		}
		return userDto.toString();
	}

	@Override
	public UserDto getUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto deleteUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "UserServiceHelperImpl [user=" + user + "]";
	}

	@Override
	public boolean validateUser(String username, long password) {
		user = new UserDaoImpl();
		String adminUsername = Constants.ADMIN_USERNAME;
		if(username.equalsIgnoreCase(adminUsername)) {
			if(password == user.getAdminPass(username)) {
				return true;
			}
		}
		return false;
	}
	
	

}
