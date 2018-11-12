package com.java.utils;

import com.java.beans.Address;
import com.java.beans.User;

public class Converter {

	public User fromPersistanceModel(com.java.dao.model.User dbUser){
		
		User user = new User();
		
		user.setUserId(dbUser.getId());
		//user.setAge(userAge);
		user.setDesignation(dbUser.getDesignation());
		user.setDob(dbUser.getDOB());
		user.setEmail(dbUser.getEmail());
		//user.setAddress(fromPersistanceModel());
		
		return user;
	}
	
	public Address fromPersistanceModel(com.java.dao.model.Address dbAddress){
		
		Address address = new Address ();
		
		address.setAddressType(dbAddress.getAddressType());
		address.setStreet(dbAddress.getStreet());
		address.setCity(dbAddress.getCity());
		address.setState(dbAddress.getState());
		address.setCountry(dbAddress.getCountry());
		
		return address;
		
	}
	
	
	public com.java.dao.model.User toPersistanceModel(User user){
		
		com.java.dao.model.User dbUser = new com.java.dao.model.User();
		
		dbUser.setId(user.getUserId());
		dbUser.setDesignation(user.getDesignation());
		dbUser.setDOB(user.getDob());
		dbUser.setEmail(user.getEmail());
		dbUser.setName(user.getName());
		
		return dbUser;
	}
	
	public com.java.dao.model.Address toPersistanceModel(Address address){
		
		com.java.dao.model.Address dbAddress = new com.java.dao.model.Address ();
		
		dbAddress.setAddressType(address.getAddressType());
		dbAddress.setStreet(address.getStreet());
		dbAddress.setCity(address.getCity());
		dbAddress.setState(address.getState());
		dbAddress.setCountry(address.getCountry());
		
		return dbAddress;
		
	}
}
