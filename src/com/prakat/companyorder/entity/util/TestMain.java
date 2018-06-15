package com.prakat.companyorder.entity.util;

import com.prakat.companyorder.entity.Company;
import com.prakat.companyorder.entity.Customer;
import com.prakat.companyorder.entity.Item;
import com.prakat.companyorder.entity.Order;
import com.prakat.companyorder.entity.OrderedItem;
import com.prakat.companyorder.entity.RegCustomer;

public class TestMain {
public static void main(String[] args) {
	
	Item item1=new Item("Nokia",20000);
	Item item2=new Item("Samsung",30000);
	Item item3=new Item("Mi",15000);
	
	
	OrderedItem orderedItem1=new OrderedItem(2, item1);
	OrderedItem orderedItem2=new OrderedItem(3, item2);
	OrderedItem orderedItem3=new OrderedItem(1, item3);
	
	Order order1=new Order(11);
	order1.addOrderedItem(orderedItem1);
	order1.addOrderedItem(orderedItem2);
	
	Order order2=new Order(22);
	order2.addOrderedItem(orderedItem2);
	order2.addOrderedItem(orderedItem3);
	
	Order order3=new Order(33);
	order3.addOrderedItem(orderedItem1);
	order3.addOrderedItem(orderedItem3);
	
	Customer customer=new Customer("Bikram");
	customer.addOrder(order1);
	customer.addOrder(order2);
	
	RegCustomer regCustomer=new RegCustomer();
	regCustomer.setCustomerName("Vishnu");
	regCustomer.setSplDiscount(20);
	regCustomer.addOrder(order1);
	regCustomer.addOrder(order3);
	
	
	
	Company company=new Company("Prakat");
	company.addCustomer(customer);
	company.addCustomer(regCustomer);
	
	System.out.println("Total Worth Of Order Placed:"
							+company.getTotalWorthofOrdersPlaced());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
