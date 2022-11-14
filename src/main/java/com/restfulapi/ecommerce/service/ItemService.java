package com.restfulapi.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.restfulapi.ecommerce.model.Category;
import com.restfulapi.ecommerce.model.Item;

public interface ItemService {
	List<Item> getAllItem();
	
	List<Item> getAllItemByCategory(Category category);

}
