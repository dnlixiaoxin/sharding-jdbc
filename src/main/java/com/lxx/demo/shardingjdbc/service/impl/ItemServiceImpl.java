package com.lxx.demo.shardingjdbc.service.impl;

import com.guazi.spring.boot.mybatis.component.spi.ICommonDao;
import com.lxx.demo.shardingjdbc.model.Item;
import com.lxx.demo.shardingjdbc.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Resource
    private ICommonDao commonDao;
	
	@Override
	public void add(Item i) {
        commonDao.save(Item.class, "add", i);
	}

	@Override
	public List<Item> find() {
        return commonDao.getListBySqlId(Item.class,"find");
	}

	
	
}
