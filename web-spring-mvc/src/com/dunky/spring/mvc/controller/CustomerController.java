package com.dunky.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dunky.spring.mvc.entity.Customer;
import com.dunky.spring.mvc.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject the customer service
	@Autowired
		private CustomerService customerService;
		
		@RequestMapping("/list")
		public String listCustomers(Model theModel) {
			
			// get customers from the dao
			List<Customer> theCustomers = customerService.getCustomers();
					
			// add the customers to the model
			theModel.addAttribute("customers", theCustomers);
			
			return "list-customers";
		}

}
