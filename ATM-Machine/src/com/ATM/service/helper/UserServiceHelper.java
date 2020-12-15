package com.ATM.service.helper;

import com.ATM.dto.UserDto;

public interface UserServiceHelper {
	
	public UserDto createUser();
	public UserDto getUserById(long id);
	public UserDto updateUser(long id);
	public UserDto deleteUser(long id);
	
}
