package com.restfulapi.ecommerce.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.restfulapi.ecommerce.model.Category;
import com.restfulapi.ecommerce.model.Item;
import com.restfulapi.ecommerce.model.Rating;
import com.restfulapi.ecommerce.repository.ItemRepository;
import com.restfulapi.ecommerce.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	private ItemRepository itemRepository;
	
	@Autowired
	public ItemServiceImpl(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	@Override
	public List<Item> getAllItem() {
		return (List<Item>) itemRepository.findAll();
	}

	@Override
	public List<Item> getAllItemByCategory(int idCategory) {
		return itemRepository.getItemByCategory(idCategory);
	}

	@Override
	public List<Item> searchItemByKey(String key) {
		return itemRepository.searchItemByKey(key);
	}

	@Override
	public List<Rating> getRatingItem(int idItem) {
		return itemRepository.getRatingItem(idItem);
	}


}
