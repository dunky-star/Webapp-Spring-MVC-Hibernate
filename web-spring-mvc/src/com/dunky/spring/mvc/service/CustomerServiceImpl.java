package com.dunky.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dunky.spring.mvc.dao.CustomerDAO;
import com.dunky.spring.mvc.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	// We need to inject Customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// Delegate call to DAO
		return customerDAO.getCustomers();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		
	}

}
