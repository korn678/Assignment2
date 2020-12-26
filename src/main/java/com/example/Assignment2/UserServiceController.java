package com.example.Assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {
	@Autowired
	   UserService userService;
	   
	   @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	   public ResponseEntity<Object> createUser(@RequestParam("username") String username, @RequestParam("password") String password) {
	      userService.CheckUser(username, password);
		  return new ResponseEntity<>(userService.SentBack() , HttpStatus.CREATED);
	   }

}