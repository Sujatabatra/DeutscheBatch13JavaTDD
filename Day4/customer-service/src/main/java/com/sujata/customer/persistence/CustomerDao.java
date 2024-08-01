package com.sujata.customer.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.customer.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	public List<Customer> findByCustomerId(String customerId);

}
