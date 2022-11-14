package com.restfulapi.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.restfulapi.ecommerce.model.Category;

public interface CategoryService {
	List<Category> getAllCategory();
	Optional<Category> getCategoryById(int id);
	
}
