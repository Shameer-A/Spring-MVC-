package com.java.dao.api;

import com.java.dao.model.Address;
import com.java.dao.model.User;


public interface IDao {

	Boolean checkConnection();
	
	Long registerUser(User user);
	
	Long persistAddress(Address address);
}
