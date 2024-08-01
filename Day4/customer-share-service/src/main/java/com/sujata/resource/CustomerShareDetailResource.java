package com.sujata.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.CustomerShareDetail;
import com.sujata.service.CustomerShareService;

@RestController
public class CustomerShareDetailResource {

	@Autowired
	CustomerShareService customerShareService;
	
	
	@GetMapping(path="/details/{cid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CustomerShareDetail> getAllDetailsResource(@PathVariable("cid") String customerId){
		return customerShareService.getDetailsByCustomerId(customerId);
	}
}
