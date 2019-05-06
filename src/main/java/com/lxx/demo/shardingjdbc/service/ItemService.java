package com.lxx.demo.shardingjdbc.service;


import com.lxx.demo.shardingjdbc.model.Item;

import java.util.List;

public interface ItemService {
	
	void add(Item i);
	
	List<Item> find();
	
}
