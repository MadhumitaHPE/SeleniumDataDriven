package com.prakat.companyorder.entity;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String CompanyName;
	private List<Customer> customers = new ArrayList<>();
	private List<Item> items = new ArrayList<>();
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Company(String companyName) {
		super();
		CompanyName = companyName;
		
	}
	
	public double getTotalWorthofOrdersPlaced(){
		double temp = 0.0;
		for(Customer c : customers){
			
				temp+= c.getTotalCustomerAmount();
			
		}
		return temp;
	}
	
	

	
	
}
