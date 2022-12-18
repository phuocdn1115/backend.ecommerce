package com.restfulapi.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.restfulapi.ecommerce.model.Category;
import com.restfulapi.ecommerce.model.Item;
import com.restfulapi.ecommerce.model.Rating;

public interface ItemService {
	List<Item> getAllItem();
	
	List<Item> getAllItemByCategory(int idCategory);
	
	List<Item> searchItemByKey(String key);

	List<Rating> getRatingItem(int idItem);
}
