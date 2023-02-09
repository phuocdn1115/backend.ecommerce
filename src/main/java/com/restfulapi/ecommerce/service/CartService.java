package com.restfulapi.ecommerce.service;

import com.restfulapi.ecommerce.model.Cart;
import com.restfulapi.ecommerce.model.CartItem;
import com.restfulapi.ecommerce.model.Customer;

public interface CartService {
	Cart createCart(Cart cart);
	Cart getCart(int idCustomer);
	Cart updateCart(Cart cart);
	Integer deleteCart(int id);

}
