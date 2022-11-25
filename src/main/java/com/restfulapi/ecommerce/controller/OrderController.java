package com.restfulapi.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.restfulapi.ecommerce.model.Order;
import com.restfulapi.ecommerce.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	
	private OrderService service;

	public OrderController(OrderService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<Order> takeOrder(@RequestBody Order order){
		return new ResponseEntity<Order>(service.addOrder(order), HttpStatus.CREATED);
	}
	

}
