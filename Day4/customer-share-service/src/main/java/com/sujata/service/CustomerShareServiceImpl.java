package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.entity.Customer;
import com.sujata.entity.CustomerShareDetail;
import com.sujata.entity.Customers;
import com.sujata.entity.Share;

@Service
public class CustomerShareServiceImpl implements CustomerShareService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<CustomerShareDetail> getDetailsByCustomerId(String customerId) {
		List<CustomerShareDetail> customerShareDetails=new ArrayList<>();
		
		Customers customers=restTemplate.getForObject("http://localhost:8084/customers/"+customerId, Customers.class);
		for(Customer customer:customers.getCustomerList()) {
			
			Share share=restTemplate.getForObject("http://localhost:8082/shares/"+customer.getShareId(), Share.class);
			
			CustomerShareDetail customerShareDetail=new CustomerShareDetail(customer.getDetailId(), 
					customer.getCustomerId(), 
					share.getShareName(), 
					customer.getShareType(), 
					customer.getQuantity()*share.getPrice());
			
			customerShareDetails.add(customerShareDetail);
		}
		return customerShareDetails;
	}

}
