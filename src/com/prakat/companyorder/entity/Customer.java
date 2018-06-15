package com.prakat.companyorder.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	protected String customerName;
	protected List<Order> orders = new ArrayList<>();

	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}
	
	
	
	public double getTotalCustomerAmount(){
		System.out.println("Cust Call");
		double temp = 0.0;
		for(Order o : orders){
			temp = temp+o.getTotalOrderAmount();
			
		}
		return temp;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
