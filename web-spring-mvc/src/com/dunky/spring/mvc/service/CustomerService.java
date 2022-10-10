package com.dunky.spring.mvc.service;

import java.util.List;

import com.dunky.spring.mvc.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}