package com.restfulapi.ecommerce;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapi.ecommerce.model.Customer;
import com.restfulapi.ecommerce.service.CustomerService;

@RestController
public class TestController {
	
	@GetMapping("/hi_world")
	public String helloworld() {
		return "HEllO WORLD";
	}
	
}
