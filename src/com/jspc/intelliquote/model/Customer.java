package com.jspc.intelliquote.model;

public class Customer {
	
	private String firstName;
	private String lastName;
	private Address address;
	private String email;
	private String phone;
	
	public Customer(String firstName, String lastName, Address address, String email, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public String getFormattedName() {
		return lastName + ", " + firstName;
	}
 }