package com.jspc.smartbid.model;

public class Bid {
	
	private Customer primaryCustomer;
	private Customer secondaryCustomer;
	private Job job;
	
	public Bid(Customer primaryCustomer, Customer secondaryCustomer, Job job) {
		this.primaryCustomer = primaryCustomer;
		this.secondaryCustomer = secondaryCustomer;
		this.job = job;
	} 
}