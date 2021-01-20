package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.data.ItemRepository;
import com.example.demo.model.Item;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {
	
	@InjectMocks
	private ItemService service;// InjectMocks : needed ItemRepository

	@Mock
	private ItemRepository itemRepository;
	
	@Test
	public void retrieveAllItems_basic() {
		when(itemRepository.findAll())
		.thenReturn(Arrays.asList(
				new Item(1, "pen", 10, 20), 
				new Item(2, "book", 20, 30), 
				new Item(3, "marker", 30, 40))
		);
		List<Item> items = service.retrieveAllItems();
		assertEquals(200, items.get(0).getValue());
		assertEquals(600, items.get(1).getValue());
		assertEquals(1200, items.get(2).getValue());
	}
}
