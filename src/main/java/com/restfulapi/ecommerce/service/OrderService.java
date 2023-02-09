package com.restfulapi.ecommerce.service;

import java.util.List;

import com.restfulapi.ecommerce.model.Order;

public interface OrderService {
	Order addOrder(Order order);
	List<Order> getAllOrderOfCustomer(int idCustomer);
}
