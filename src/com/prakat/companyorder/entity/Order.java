package com.prakat.companyorder.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int orderId;
	private List<OrderedItem> orderedItems = new ArrayList<>();

	public Order(int orderId) {
		super();
		this.orderId = orderId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	

	public void setOrderedItems(java.util.List<OrderedItem> orderedItems) {
		this.orderedItems = orderedItems;
	}

	public void addOrderedItem(OrderedItem orderedItem) {
		this.orderedItems.add(orderedItem);
	}
	
	public double getTotalOrderAmount(){
		double temp = 0.0;
		for(OrderedItem oi : orderedItems){
			temp += oi.getTotalOrderItemAmount();
			
		}
		return temp;
	}

}
