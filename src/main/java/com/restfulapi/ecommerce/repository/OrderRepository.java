package com.restfulapi.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfulapi.ecommerce.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
