package com.example.Assignment2;

import org.springframework.stereotype.Service;

@Service
public class UserService{
	
	User user;
	
	public void CheckUser(String username , String password) {
		
		if( username.matches("[A-Z][a-z]*") && password.matches("[A-Z][a-z]*")) {
			user = new User( username , null , "success" );
		}
		else 
			user = new User( "xxxx" , "1234" , "fail" );
	}
	
	public User SentBack() {
		return user;
	}
   
}