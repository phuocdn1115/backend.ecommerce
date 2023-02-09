package com.restfulapi.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restfulapi.ecommerce.model.CartItem;
import com.restfulapi.ecommerce.model.Order;

@Repository
public interface CartItemRepository  extends JpaRepository<CartItem, Integer> {
	

}
