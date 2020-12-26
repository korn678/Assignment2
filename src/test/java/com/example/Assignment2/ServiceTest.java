package com.example.Assignment2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(UserServiceController.class)
public class ServiceTest {
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private UserService userService;
	
	@Test
	  public void UserTest() throws Exception {
	    mvc.perform(
	    MockMvcRequestBuilders.post("/checkLogin")
	    .param("username", "exits")
	    .param("password", "exits")
	    .accept(MediaType.APPLICATION_JSON))
	    .andExpect(MockMvcResultMatchers.status().isCreated());
	  }
}
