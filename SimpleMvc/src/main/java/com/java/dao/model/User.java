package com.java.dao.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USERS")
@AttributeOverride(name = "id", column = @Column(name = "USER_ID"))
public class User extends BaseModel{

		
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESIGNATION")
	private String designation;

	@Column(name="EMAIL")
	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name="DOB")
	private Date DOB;
	
	@Override
	public String toString(){
		
		return "User Deatils: Name -"+name+" Designation"+designation+" dob"+DOB+" email-"+email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
