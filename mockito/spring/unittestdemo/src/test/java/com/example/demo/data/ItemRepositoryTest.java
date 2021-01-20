package com.example.demo.data;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.Item;

@DataJpaTest
public class ItemRepositoryTest {
	
	@Mock
	private ItemRepository itemRepository;
	
	@Test
	public void testFindAll() {
		List<Item> itemsList = new ArrayList<>();
		itemsList.add(new Item());
		itemsList.add(new Item());
		itemsList.add(new Item());
		when(itemRepository.findAll()).thenReturn(itemsList);
		assertEquals(3, itemRepository.findAll().size());
		
		/*
		 * for below to run we need actual db config/db data
		 * 
		 * List<Item> items = repository.findAll();
		 * assertEquals(3,items.size());
		 * */
	}
	
	@Test
	public void testFindOne() {
		Item item = new Item();
		item.setId(1001);
		Optional<Item> itemMock = Optional.of(item);
		when(itemRepository.findById(1001)).thenReturn(itemMock);
		assertEquals(1001, itemRepository.findById(1001).get().getId());
		/*
		 * for below to run ,we need db setup : 
		 * Item item = repository.findById(10001).get();
			assertEquals("Item1",item.getName());
		 * */
	}
	
}
