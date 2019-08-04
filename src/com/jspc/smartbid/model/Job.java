package com.jspc.smartbid.model;

import java.util.List;

public class Job {
	
	private int type;
	private double price;
	private double materials;
	private int installments;
	private List<JobArea> areas;
	private List<JobService> services;
	
	public Job(int type, double price, double materials, int installments, List<JobArea> areas, List<JobService> services) {
		this.type = type;
		this.price = price;
		this.materials = materials;
		this.installments = installments;
		this.areas = areas;
		this.services = services;
	}
	
	public boolean includesMaterials() {
		return materials == 0;
	}
	
	/**
	 * @todo - calculate installment prices based (price + materials) / installments
	 * 		 - installment prices may be different if total price isn't evenly divisible
	 * 
	 * @return 
	 */
	
	public double[] getInstallmentPrices() {
		
		// compute installment prices: (price + materials) / installments
		// installment prices may be different if total isn't evenly divisible
		// i.e., installment prices: 1666, 1667, 1667 = 5000 
		
		return new double[installments];
	}
	
	public void addArea(int index, JobArea area) {
		areas.add(index, area);
	}
	
	public void removeArea(int index) {
		areas.remove(index);
	}
}