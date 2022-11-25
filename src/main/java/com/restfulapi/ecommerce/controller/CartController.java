package com.restfulapi.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapi.ecommerce.model.Cart;
import com.restfulapi.ecommerce.model.Customer;
import com.restfulapi.ecommerce.service.CartService;
import com.restfulapi.ecommerce.service.impl.CartServiceImpl;

@RestController
@RequestMapping("/api/cart")
public class CartController {
	private CartService cartService;

	public CartController(CartService cartService) {
		super();
		this.cartService = cartService;
	}
	
	@GetMapping
	public ResponseEntity<Cart> createCart(@RequestBody Customer customer){
		return new ResponseEntity<Cart>(cartService.getCart(customer),HttpStatus.OK);
	}
	
	@GetMapping("/update")
	public ResponseEntity<Cart> updateCart(Cart cart){
		return new ResponseEntity<Cart>(cartService.updateCart(cart),HttpStatus.OK);
	}

}
