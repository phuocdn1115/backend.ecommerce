package com.restfulapi.ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapi.ecommerce.model.Category;
import com.restfulapi.ecommerce.repository.CategoryRepository;
import com.restfulapi.ecommerce.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	private CategoryRepository categoRepository;
	
	@Autowired
	public CategoryServiceImpl(CategoryRepository categoRepository) {
		super();
		this.categoRepository = categoRepository;
	}

	@Override
	public List<Category> getAllCategory() {
		return categoRepository.findAll() ;
	}

	@Override
	public Optional<Category> getCategoryById(int id) {
		return categoRepository.findById(id);
	}

	
}
