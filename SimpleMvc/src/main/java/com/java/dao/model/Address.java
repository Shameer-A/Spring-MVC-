package com.java.dao.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="Address")
@AttributeOverride(name = "id", column = @Column(name = "ADDRESS_ID"))
public class Address extends BaseModel{

	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="CITY")
	private String city;
	
	@Column (name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="ID_ADDRESS_TYPE")
	private int addressType;

	@Override
	public String toString(){
		
		return "Address: User -"+user+" Street -"+street+" City -"+city+" State -"+state+" Country -"+country+" Address Type-"+addressType;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAddressType() {
		return addressType;
	}

	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}
	
}
