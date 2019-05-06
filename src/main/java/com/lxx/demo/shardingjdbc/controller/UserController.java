package com.lxx.demo.shardingjdbc.controller;


import com.lxx.demo.shardingjdbc.model.User;
import com.lxx.demo.shardingjdbc.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/user/add")
    public String add(Integer id) {
        User u = new User();
        u.setName("user" + id).
                setDate(new Date()).
                setUserid((long) id);
        userService.add(u);
        return "插入成功";
    }

    @RequestMapping("/user/find")
    public List<User> find() {
        return userService.find();
    }

}
