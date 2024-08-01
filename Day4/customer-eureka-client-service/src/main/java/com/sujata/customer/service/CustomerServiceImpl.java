package com.sujata.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.customer.entity.Customer;
import com.sujata.customer.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> getCustomerDataByID(String customerId) {
		return customerDao.findByCustomerId(customerId);
		
	}

}
