package com.jspc.smartbid.model;

public class Address {
	
	private int number;
	private String street;
	private String type;
	private String city;
	private String state;
	private String postalCode;
	
	public Address(int number, String street, String type, String city, String state, String postalCode) {
		this.number = number;
		this.street = street;
		this.type = type;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
	public String getFormattedAddress() {
		return number + " " + street + " " + type + ", " + city + ", " + state + " " + postalCode;
	}
}