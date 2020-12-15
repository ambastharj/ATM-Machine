package com.ATM.runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.ATM.dto.UserDto;
import com.ATM.service.helper.UserServiceHelper;
import com.ATM.service.helper.impl.UserServiceHelperImpl;

public class ATMRunner {

	public static void main(String[] args) throws ParseException {
		
		UserDto user = new UserDto();
		UserServiceHelper userHelper = new UserServiceHelperImpl(); 
		System.out.println("========================== *Welcome to private ATM. Hope you're having a great day!* ========================== ");
		System.out.println("\nSelect from the following options");
		System.out.println("1. To create a new user.");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
			case 1:
				System.out.print("Enter username : ");
				String username = sc.next();
				System.out.print("\nEnter Password : ");
				long pass = sc.nextLong();
				
				boolean b = userHelper.validateUser(username, pass);
				
				if(b) {
					System.out.println("Login Successful!");
					System.out.println("\n\nEnter the details for creating user");
					
					System.out.print("Enter First name : ");
					String fname = sc.next();
					
					System.out.print("\nEnter Last name : ");
					String lname = sc.next();
					
					System.out.print("\nEnter User name : ");
					String usname = sc.next();
					
					System.out.print("\nEnter pin : ");
					int pin = sc.nextInt();
					
					System.out.println("\nEnter account type : ");
					String actype = sc.next();
					
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String date = sdf.format(new Date());
					
					user.setFirstName(fname);
					user.setLastName(lname);
					user.setUserName(usname);
					user.setPin(pin);
					user.setCreateDateTime(date);
					user.setAccountType(actype);
					String success = userHelper.createUser(user);
					System.out.println(success);
				}
				else {
					System.out.println("Wrong credentials!");
				}
				break;
			default :
				System.out.println("Wrong choice!");
		}
		sc.close();
	}

}
