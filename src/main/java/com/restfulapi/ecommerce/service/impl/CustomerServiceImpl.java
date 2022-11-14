package com.restfulapi.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapi.ecommerce.model.Customer;
import com.restfulapi.ecommerce.repository.CustomerRepository;
import com.restfulapi.ecommerce.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}


}
