package com.dunky.spring.mvc.dao;
import java.util.List;
import com.dunky.spring.mvc.entity.Customer;


public interface CustomerDAO {
	
	public List<Customer> getCustomers();

}
