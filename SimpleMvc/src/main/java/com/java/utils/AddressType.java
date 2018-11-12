package com.java.utils;

public enum AddressType {

	HOME(1),OFFICE(2);
	
	private int addressType;

	AddressType(){}
	
	AddressType(int addressType){
		this.addressType = addressType;
	}
	
	public int getAddressType() {
		return addressType;
	}

	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}
	
	
}
