package com.restfulapi.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapi.ecommerce.model.Category;
import com.restfulapi.ecommerce.model.Item;
import com.restfulapi.ecommerce.model.Rating;
import com.restfulapi.ecommerce.service.ItemService;

@RestController
@RequestMapping("/api/item")
public class ItemController {

	private ItemService itemService;

	public ItemController(ItemService intemService) {
		super();
		this.itemService = intemService;
	}
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Item>> getAllItem(){
		return new ResponseEntity<List<Item>>(itemService.getAllItem(),HttpStatus.OK);
	}
	
	@GetMapping("/bycategory")
	public ResponseEntity<List<Item>> getItemByCategory(@RequestParam("idCategory")  int idCategory){
		return new ResponseEntity<List<Item>>(itemService.getAllItemByCategory(idCategory),HttpStatus.OK);
	}
	
	@GetMapping("/searchByKey")
	public ResponseEntity<List<Item>> searchItemByKey(@RequestParam("key") String key){
		return new ResponseEntity<List<Item>>(itemService.searchItemByKey("%"+key+"%"),HttpStatus.OK);
	}
	
	@GetMapping("/getRating")
	public ResponseEntity<List<Rating>> getRatingItem(@RequestParam("idItem") int idItem){
		return new ResponseEntity<List<Rating>>(itemService.getRatingItem(idItem), HttpStatus.OK);
	}
}
