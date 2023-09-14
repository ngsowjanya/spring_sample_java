package com.springcore.service;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.springcore.pojo.Customer;
import com.springcore.repository.CustomerRepository;
@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;


	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
