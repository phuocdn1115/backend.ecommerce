package com.restfulapi.ecommerce.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restfulapi.ecommerce.model.Category;
import com.restfulapi.ecommerce.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	@Query("select i from Item i where i.category =?1")
	List<Item> getItemByCategory(Category category);
	
	@Query("select i from Item i where i.name like ?1")
	List<Item> searchItemByKey(String key);

}
