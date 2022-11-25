package com.restfulapi.ecommerce.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapi.ecommerce.model.Cart;
import com.restfulapi.ecommerce.model.Customer;
import com.restfulapi.ecommerce.repository.CartRepository;
import com.restfulapi.ecommerce.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	private CartRepository cartRepository;
	
	@Autowired
	public CartServiceImpl(CartRepository cartRepository) {
		super();
		this.cartRepository = cartRepository;
	}

	@Override
	public Cart createCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public Cart getCart(Customer customer) {
		Cart cart = cartRepository.getCartByCustomer(customer);
		if(cart == null){
			cart = new Cart(0, 0l, System.currentTimeMillis());
			cart.setCustomer(customer);
			cart = cartRepository.save(cart);
		}
		return cart;
	}

	@Override
	public Cart updateCart(Cart cart) {
		//Cart cart = cartRepository.getReferenceById(1);
		return cartRepository.save(cart);
	}

	
	

}
