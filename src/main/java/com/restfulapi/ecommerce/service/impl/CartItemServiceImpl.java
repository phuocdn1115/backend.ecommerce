package com.restfulapi.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapi.ecommerce.repository.CartItemRepository;
import com.restfulapi.ecommerce.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService{

	private CartItemRepository repos;
	
	@Autowired
	public CartItemServiceImpl(CartItemRepository repos) {
		this.repos = repos;
	}
	
	@Override
	public Integer deleteCartItem(int id) {
		repos.deleteById(id);
		return id;
	}

}
