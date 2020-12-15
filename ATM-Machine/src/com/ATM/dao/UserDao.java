package com.ATM.dao;

import com.ATM.dto.UserDto;

public interface UserDao {
	
	public UserDto createUser();
	public UserDto getUserById(long id);
	public UserDto updateUser(long id);
	public UserDto deleteUser(long id);
	
}
