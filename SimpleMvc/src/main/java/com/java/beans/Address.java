package com.java.beans;

import javax.validation.constraints.NotNull;

public class Address {

	@NotNull
	private String street;
	
	@NotNull
	private String city;
	
	@NotNull
	private String state;
	
	@NotNull
	private String country;
	
	private int addressType;
	
	
	public Address(){}
	
	public Address(String street,String city,String state,String country,int addressType){
		this.street = street;
		this.city = city;
		this.state = state;
		this.country= country;
		this.addressType = addressType;
	}
	
	@Override
	public String toString(){
		
		return "Address: Street -"+street+" City -"+city+" State -"+state+" Country -"+country+" Address Type-"+addressType;
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
