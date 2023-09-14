package com.springcore.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springcore.pojo.Customer;

import java.util.ArrayList;
@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("sowjanya");
		customer.setLastname("nallanagula");
		customers.add(customer);
		return  customers;	
	}

	  
}

