package com.example.Assignment2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class User {
	
	private String username;
	private String password;
	private String loginStatus;

	public User(String username , String password , String status) {
		this.username = username ;
		this.password = password;
		this.loginStatus = status;
	}
	
	public String getUsername() {
	   return username;
	}
	
	public void setUsername(String username) {
	   this.username = username;
	}
	
	public String getPassword() {
	   return password;
	}
	
	public void setPassword(String password) {
	   this.password = password;
	}
	
	public String getStatus() {
		return loginStatus;
	}
		
	public void setStatus(String status) {
		this.loginStatus = status;
	}
	
}
