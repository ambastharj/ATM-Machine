package com.ATM.dao;

import com.ATM.dto.UserDto;

public interface UserDao {
	
	public UserDto createUser(UserDto newUser);
	public UserDto getUserById(long id);
	public UserDto updateUser(long id);
	public UserDto deleteUser(long id);
	public long getAdminPass(String username);
	
}
