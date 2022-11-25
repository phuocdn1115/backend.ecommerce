package com.restfulapi.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapi.ecommerce.model.Category;
import com.restfulapi.ecommerce.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	private CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@GetMapping
	public ResponseEntity<List<Category>> getCategory(){
		return new ResponseEntity<List<Category>>(categoryService.getAllCategory(),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Category>> getCategoryById(@PathVariable("id")  int id){
		return new ResponseEntity<Optional<Category>>(categoryService.getCategoryById(id),HttpStatus.OK);
	}
}
