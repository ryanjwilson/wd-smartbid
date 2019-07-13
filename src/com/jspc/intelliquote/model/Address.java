package com.jspc.intelliquote.model;

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
	
	public int getNumber() {
		return number;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getType() {
		return type;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public String format() {
		return number + " " + street + " " + type + ", " + city + ", " + state + " " + postalCode;
	}
}