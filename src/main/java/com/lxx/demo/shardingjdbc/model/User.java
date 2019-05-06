package com.lxx.demo.shardingjdbc.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class User implements Serializable {

	private long id;

    private String name;

    private Date date;

	private Long userid;
	
}
