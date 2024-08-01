package com.sujata.customer.service;

import java.util.List;

import com.sujata.customer.entity.Customer;

public interface CustomerService {

	List<Customer> getCustomerDataByID(String customerId);
	
}
