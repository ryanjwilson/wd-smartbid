package com.jspc.intelliquote.model;

public class Quote {
	
	private Customer primaryCustomer;
	private Customer secondaryCustomer;
	private Job job;
	
	public Quote(Customer primaryCustomer, Customer secondaryCustomer, Job job) {
		this.primaryCustomer = primaryCustomer;
		this.secondaryCustomer = secondaryCustomer;
		this.job = job;
	} 
}