package com.ATM.service.helper;

import com.ATM.dto.UserDto;

public interface UserServiceHelper {
	
	public String createUser(UserDto newUser);
	public UserDto getUserById(long id);
	public UserDto updateUser(long id);
	public UserDto deleteUser(long id);
	public boolean validateUser(String username, long password);
	
}
