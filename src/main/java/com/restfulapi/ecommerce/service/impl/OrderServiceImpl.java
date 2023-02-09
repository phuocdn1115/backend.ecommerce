package com.restfulapi.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapi.ecommerce.model.Order;
import com.restfulapi.ecommerce.repository.OrderRepository;
import com.restfulapi.ecommerce.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	private OrderRepository repository;

	@Autowired
	public OrderServiceImpl(OrderRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Order addOrder(Order order) {
		return repository.save(order);
	}

	@Override
	public List<Order> getAllOrderOfCustomer(int idCustomer) {
		return repository.getAllOrderOfCustomer(idCustomer);
	}
	

}
