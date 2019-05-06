package com.lxx.demo.shardingjdbc.controller;

import com.lxx.demo.shardingjdbc.model.Item;
import com.lxx.demo.shardingjdbc.service.ItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Resource
	private ItemService itemService;
	
	@RequestMapping("/add")
	public String add(Integer value) {
		Item i = new Item();
		i.setValue(value).setDate(new Date());
		itemService.add(i);
		return "添加成功";
	}

	@RequestMapping("/find")
	public List<Item> find() {
		return itemService.find();
	}
	
	
	
}
