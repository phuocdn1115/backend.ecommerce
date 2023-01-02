package com.restfulapi.ecommerce.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restfulapi.ecommerce.model.CartItem;
import com.restfulapi.ecommerce.model.Category;
import com.restfulapi.ecommerce.model.Item;
import com.restfulapi.ecommerce.model.Rating;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	@Query("select i from Item i where i.category.id =?1")
	List<Item> getItemByCategory(int idCategory);
	
	@Query("select i from Item i where i.name like ?1")
	List<Item> searchItemByKey(String key);
	
	@Query("select r from Rating r where r.item.id = ?1")
	List<Rating> getRatingItem(int idItem);

	@Query("select c from CartItem c where c.cart.id = ?1")
	List<CartItem> getItemOfCart(int idCart);
}
