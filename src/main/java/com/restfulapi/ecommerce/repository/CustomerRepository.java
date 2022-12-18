package com.restfulapi.ecommerce.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.restfulapi.ecommerce.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	@Query("select c from Customer c where email = ?1 and password =?2")
	Customer checkLogin(String username, String password);

}
