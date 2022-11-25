package com.restfulapi.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapi.ecommerce.model.Address;
import com.restfulapi.ecommerce.model.Customer;
import com.restfulapi.ecommerce.service.CustomerService;

@RestController
@RequestMapping(value = "/api/customer")
public class CustomerController {

	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping
	public ResponseEntity<Customer> saveCustomer(@RequestBody  Customer customer){
		return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED)  ;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomer(),HttpStatus.OK);
	}
	
	@GetMapping("/checkLogin")
	public ResponseEntity<Optional<Customer>> checkLogin(@RequestParam(name ="username") String username, @RequestParam(name ="password") String password){
		return new ResponseEntity<Optional<Customer>>(customerService.checkLogin(username, password),HttpStatus.OK);
	}
		
}
