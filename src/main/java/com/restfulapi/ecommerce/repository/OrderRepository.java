package com.restfulapi.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restfulapi.ecommerce.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	@Query("select o from Order o where o.cart.id in (select c.id from Cart c where c.customer.id = ?1 and c.isOrder = 'yes')")
	List<Order> getAllOrderOfCustomer(int idCustomer);

}
