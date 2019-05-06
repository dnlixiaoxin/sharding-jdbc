package com.lxx.demo.shardingjdbc.service;


import com.lxx.demo.shardingjdbc.model.User;

import java.util.List;

public interface UserService {

	void add(User u);
	
	List<User> find();
	
}
