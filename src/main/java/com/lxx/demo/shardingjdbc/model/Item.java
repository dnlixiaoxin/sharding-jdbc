package com.lxx.demo.shardingjdbc.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Item implements Serializable {

	private long id;
	
	private int value;
	
	private Date date;
	
}
