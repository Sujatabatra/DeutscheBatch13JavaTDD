package com.sujata.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class Customers {

	private List<Customer> customerList=new ArrayList<>();
	
	public Customers() {
		
	}

	public Customers(List<Customer> customerList) {
		super();
		this.customerList = customerList;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
	
}
