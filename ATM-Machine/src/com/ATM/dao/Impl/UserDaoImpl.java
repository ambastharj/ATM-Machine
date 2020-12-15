package com.ATM.dao.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ATM.dao.UserDao;
import com.ATM.dto.UserDto;
import com.ATM.util.DBConnection;

public class UserDaoImpl implements UserDao{

	Connection connection = null;
	@Override
	public UserDto createUser(UserDto newUser) {
		connection = DBConnection.getConnection();
		
//		String format = "STR_TO_DATE ( " + "'" + newUser.getCreateDateTime() + "', " + "'" + "%d/%m/%Y %H:%i:%s" + "'"+" )";
		String query = "insert into Users values"
						+"( "
						+newUser.getUserId()+", "
						+"'"+newUser.getUserName()+"'"+", "
						+"'"+newUser.getFirstName()+"'"+", "
						+"'"+newUser.getLastName()+"'"+", "
						+newUser.getPin()+", "
						+"'"+newUser.getCreateDateTime()+"'"+", "
						+"'"+newUser.getAccountType()+"'"
						+" )";
		try {
			Statement stmt = connection.createStatement();
			if(stmt.executeUpdate(query)>0) {
				String newId = "select user_id from users where user_name = '"+newUser.getUserName()+"'";
				ResultSet rs = stmt.executeQuery(newId);
				while(rs.next()) {
					long id = rs.getLong("user_id");
					newUser.setUserId(id);
				}
				return newUser;
			}
		}
		catch(SQLException sql) {
			System.out.println("Error while creating the statement. "+sql);
		}
		return null;
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
	public long getAdminPass(String username) {
		connection = DBConnection.getConnection();
		Statement stmt;
		ResultSet result = null;
		String query = "Select pin from Users where user_name = '" + username +"'";
		long pass = 0;
		try {
			stmt = connection.createStatement();
			result = stmt.executeQuery(query);
			
			while(result.next()) {
				pass = result.getInt("Pin");
			}
		} catch (SQLException e) {
			System.out.println("Could not create the statement. "+e);
		}
		
		return pass;
	}	

}
