package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.ItemRepository;
import com.example.demo.model.Item;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public Item retrieveHardcodedItem() {
		return new Item(1, "Ball", 10, 100);
	}
	
	public List<Item> retrieveAllItems() {
		//System.out.println("hello");
		List<Item> items = itemRepository.findAll();
		for(Item item: items) {
			item.setValue(item.getPrice() * item.getQuantity());
		}
		return items;
	}
}
