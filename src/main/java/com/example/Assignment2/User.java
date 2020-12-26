package com.example.Assignment2;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
