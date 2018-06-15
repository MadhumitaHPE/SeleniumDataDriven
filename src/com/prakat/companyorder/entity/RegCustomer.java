package com.prakat.companyorder.entity;

public class RegCustomer extends Customer {
	private double splDiscount;

	public double getsplDiscount() {
		return 0.0;
	}

	public double getSplDiscount() {
		return splDiscount;
	}

	public void setSplDiscount(double splDiscount) {
		this.splDiscount = splDiscount;
	}

	public double getTotalCustomerAmount(){
		System.out.println("Reg Cust Call");
		double temp = 0.0;
		for(Order o : orders){
			temp = temp+o.getTotalOrderAmount();
		}
		temp= temp-((temp * splDiscount)/100);
		return temp;
	}
	
}
