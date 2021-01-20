package com.example.demo.controller;



import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;


@WebMvcTest(ItemController.class)
public class ItemControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemService businessService;
	
	@Test
	public void hardcoded_test() throws Exception {
		
		// prepare mock request
		RequestBuilder request = MockMvcRequestBuilders
				.get("/getitem")
				.accept(MediaType.APPLICATION_JSON);
		
		// stub : mock objects method call returns empty if not stubbed :)
		when(businessService.retrieveHardcodedItem()).thenReturn(new Item(1,"Ball",10,100));
		
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string("{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100,\"value\":0}"))
				.andReturn();
		//JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
		System.out.println(result.getResponse().getContentAsString());
	}
	
	
	@Test
	public void retrieveAllItems_basic() throws Exception{
		// preparing request
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getitemlist").accept(MediaType.APPLICATION_JSON);
		
		// stub stub stub, else method call on mocked object returns null/empty
		when(businessService.retrieveAllItems())
		.thenReturn(Arrays.asList(
				new Item(1, "item1", 10, 100),
				new Item(2, "item2", 20, 200),
				new Item(3, "item3", 30, 300)
				));
		
		// verify
		MvcResult result = mockMvc.perform(requestBuilder)
		.andExpect(status().isOk())
		.andExpect(content().json("[{id:1,name:item1,price:10,quantity:100},{id:2,name:item2,price:20,quantity:200},{id:3,name:item3,price:30,quantity:300}]"))
		.andReturn();
	}

}

