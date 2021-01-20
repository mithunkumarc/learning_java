package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/getitem")
	public Item getHardCodedItem() {
		Item item = itemService.retrieveHardcodedItem();
		return item;
	}	
	
	@GetMapping("/getitemlist")
	public List<Item> retrieveAllItems() {
		return itemService.retrieveAllItems();
	}
	
}
