package com.sujata.customer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.customer.entity.Customers;
import com.sujata.customer.service.CustomerService;

@RestController
public class CustomerResource {

	@Autowired
	CustomerService customerService;
	
	@GetMapping(path = "/customers/{cId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Customers getCustomerDetailsByIdResource(@PathVariable("cId") String customerId) {
		return new Customers(customerService.getCustomerDataByID(customerId));
	}
}
