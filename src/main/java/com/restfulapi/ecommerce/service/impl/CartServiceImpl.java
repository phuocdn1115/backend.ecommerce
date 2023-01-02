package com.restfulapi.ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapi.ecommerce.model.Cart;
import com.restfulapi.ecommerce.model.CartItem;
import com.restfulapi.ecommerce.model.Customer;
import com.restfulapi.ecommerce.repository.CartRepository;
import com.restfulapi.ecommerce.repository.CustomerRepository;
import com.restfulapi.ecommerce.repository.ItemRepository;
import com.restfulapi.ecommerce.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	private CartRepository cartRepository;
	private CustomerRepository customerRepository;
	private ItemRepository itemRepository;
	
	@Autowired
	public CartServiceImpl(CartRepository cartRepository, CustomerRepository customerRepository,ItemRepository itemRepository) {
		super();
		this.cartRepository = cartRepository;
		this.customerRepository = customerRepository;
		this.itemRepository = itemRepository;
	}

	@Override
	public Cart createCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public Cart getCart(int idCustomer) {
		Cart cart = cartRepository.getCartByCustomer(idCustomer);
		if(cart == null){
			cart = new Cart(0, 0l, System.currentTimeMillis());
			Optional<Customer> customer = customerRepository.findById(idCustomer);
			cart.setCustomer(customer.get());
			cart = cartRepository.save(cart);
		}
		else {
			List<CartItem> cartItems = itemRepository.getItemOfCart(cart.getId());
			cart.setCartItems(cartItems);
			}
		return cart;
	}

	@Override
	public Cart updateCart(Cart cart) {
		//Cart cart = cartRepository.getReferenceById(1);
		return cartRepository.save(cart);
	}
	
}
