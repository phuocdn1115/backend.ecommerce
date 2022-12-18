package com.restfulapi.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.restfulapi.ecommerce.model.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);
	List<Customer> getAllCustomer();
	Customer checkLogin(String username, String password);
}
