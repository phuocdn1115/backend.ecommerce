package com.restfulapi.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restfulapi.ecommerce.model.Cart;
import com.restfulapi.ecommerce.model.Customer;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{
	
	@Query("select c from Cart c where c.customer.id =?1 and c not in (select o.cart from Order o)")
	Cart getCartByCustomer(int idCustomer);
	
}
