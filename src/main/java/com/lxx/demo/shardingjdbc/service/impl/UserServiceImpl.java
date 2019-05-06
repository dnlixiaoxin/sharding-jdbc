package com.lxx.demo.shardingjdbc.service.impl;

import com.guazi.spring.boot.mybatis.component.spi.ICommonDao;
import com.lxx.demo.shardingjdbc.model.User;
import com.lxx.demo.shardingjdbc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("usersService")
public class UserServiceImpl implements UserService {

    @Resource
    private ICommonDao commonDao;

    @Override
    public void add(User u) {
        commonDao.save(User.class, "add", u);
    }

    @Override
    public List<User> find() {
        return commonDao.getListBySqlId(User.class,"find");
    }


}
