package com.java.logic.impl;

import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.beans.User;
import com.java.dao.api.IDao;
import com.java.logic.api.ILogic;
import com.java.utils.Converter;

public class Logic implements ILogic {
	
	private static final Logger LOG = Logger.getLogger(Logic.class);
	
	@Autowired
	IDao daoFactory;
	Converter converter= new Converter();

	public User checkUser(User user) {
		LOG.debug ("Check User age");
		
		int userAge = getDiffYears(user.getDob(), new Date());
		
		user.setAge(userAge);
		
		LOG.debug("User Age : "+userAge);
		
		return user;
	}
	
	public User registerUser(User user) {
		
		LOG.debug("User Details : "+user);
		
		Long userId =  daoFactory.registerUser(converter.toPersistanceModel(user));
		user.setUserId(userId);
		
		LOG.debug("Successfully Registered user : "+userId);
		
		com.java.dao.model.Address modelAddress = converter.toPersistanceModel(user.getAddress());
		
		modelAddress.setUser(converter.toPersistanceModel(user));
		
		Long addressId = daoFactory.persistAddress(modelAddress);
		
		LOG.debug("Successfully peristed Address : "+addressId);
		
		user.setUserId(userId);

		return user;
	}
	
	public boolean checkDbConnection() {
		
		Boolean checkConnectionFlag = daoFactory.checkConnection();
		
		LOG.debug("DB Connection Status: "+checkConnectionFlag);
		
		return null != checkConnectionFlag ? checkConnectionFlag : false;
		
	}
	
	private  int getDiffYears(Date first, Date last) {
	    Calendar a = getCalendar(first);
	    Calendar b = getCalendar(last);
	    int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
	    if (a.get(Calendar.DAY_OF_YEAR) > b.get(Calendar.DAY_OF_YEAR)) {
	        diff--;
	    }
	    return diff;
	}

	private Calendar getCalendar(Date date) {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    return cal;
	}

	public IDao getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(IDao daoFactory) {
		this.daoFactory = daoFactory;
	}

}
