package com.java.dao.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.dao.api.IDao;
import com.java.dao.model.Address;
import com.java.dao.model.User;

@Repository
public class DaoImpl implements IDao {

	private static final Logger LOG = Logger.getLogger(DaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	 private Session getSession() {
		     return sessionFactory.openSession();
		
	}

	
	public Boolean checkConnection() {
		
		Date dbSysDate = null;
		
		LOG.debug("check DAO Connection start");
		
		try{
			
			Session session = getSession();
			
			session.beginTransaction();
			
			dbSysDate = (Date) session.createSQLQuery("Select sysdate from dual").uniqueResult();
			
			 
			session.getTransaction().commit();
			
			LOG.debug("Sys date from DB : "+dbSysDate);
			
		}catch(Exception e){
			
			LOG.debug("Exception Occured : "+e);
			return false;
			
		}
		
		return null!= dbSysDate ;

	}


	public Long registerUser(User user) {
		
		LOG.debug("Register user : "+user);
		
		Session session = getSession();
		
		session.beginTransaction();
		
		user.setCreationDate(new Date());
		
		Long userId = (Long) session.save(user);
		
		
		LOG.debug("User Id : {}"+userId);
		
		session.getTransaction().commit();
		return userId;
	}


	public Long persistAddress(Address address) {

		LOG.debug("Address user : "+address);
		
		Session session = getSession();
		
		session.beginTransaction();
		
		address.setCreationDate(new Date());
		
		Long addressId = (Long) session.save(address);
		
		
		LOG.debug("Address Id : {}"+addressId);
		
		session.getTransaction().commit();
		return addressId;
		
	}

}
