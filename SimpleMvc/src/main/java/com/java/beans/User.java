package com.java.beans;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
	private Long userId;
	
	@Size(min=3, max=30)
	private String name;
	
	private int age;
	
	private String designation;
	
	@NotNull
	private Date dob;
	
	 @Email @NotEmpty
	 private String email;
	 
	private Address address;

	public User(){}
	
	public User(String name, int age, String designation, String email, Address address){
		this.name= name;
		this.age = age;
		this.designation = designation;
		this.email = email;
		this.address = address;
	}

	@Override
	public String toString(){
		
		return "User Deatils: Name -"+name+" age"+age+" Designation"+designation+" dob"+dob+" email-"+email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int userAge) {
		this.age = userAge;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
