package com.restfulapi.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapi.ecommerce.model.Category;
import com.restfulapi.ecommerce.model.Item;
import com.restfulapi.ecommerce.service.ItemService;

@RestController
@RequestMapping("/api/item")
public class ItemController {

	private ItemService intemService;

	public ItemController(ItemService intemService) {
		super();
		this.intemService = intemService;
	}
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Item>> getAllItem(){
		return new ResponseEntity<List<Item>>(intemService.getAllItem(),HttpStatus.OK);
	}
	
	@GetMapping("/bycategory")
	public ResponseEntity<List<Item>> getItemByCategory(@RequestBody  Category category){
		return new ResponseEntity<List<Item>>(intemService.getAllItemByCategory(category),HttpStatus.OK);
	}
}
