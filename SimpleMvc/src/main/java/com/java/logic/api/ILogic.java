package com.java.logic.api;

import com.java.beans.User;

public interface ILogic {

	User checkUser(User user);
	
	boolean checkDbConnection();
	
	User registerUser(User user);
}
