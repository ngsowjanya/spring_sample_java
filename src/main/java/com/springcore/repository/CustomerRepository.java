package com.springcore.repository;

import java.util.List;

import com.springcore.pojo.Customer;

public interface CustomerRepository {
List<Customer> findAll();
}
