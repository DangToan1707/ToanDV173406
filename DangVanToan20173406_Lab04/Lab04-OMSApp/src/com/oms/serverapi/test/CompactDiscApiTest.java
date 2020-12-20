package com.oms.serverapi.test;

import com.oms.bean.CompactDisc;
import com.oms.serverapi.MediaApi;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CompactDiscApiTest {
	private MediaApi api = new MediaApi();
	
	@Test
	public void testGetAllBooks() {
		HashMap<String, String> query = new HashMap<>();

		query.put("title", "Selena Gomez 2020");

		ArrayList<CompactDisc> list= api.getCds(query);
		assertEquals("Error in getCds API!", list.size(), 1);
	}
	
	@Test(timeout = 1000)
	public void testResponse() {
		api.getCds(null);
	}
}