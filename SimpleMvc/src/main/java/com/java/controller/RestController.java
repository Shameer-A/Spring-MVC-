package com.java.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.beans.Address;
import com.java.beans.User;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

	
	@RequestMapping("/getUser/{userName}")
    public User message(@PathVariable String userName) {
 
		User user = new User(userName , 27, "SE", userName+"@gmail.com", new Address("PTP","Bangalore","KA","IND",1));
		
        return user;
    }
	
}
