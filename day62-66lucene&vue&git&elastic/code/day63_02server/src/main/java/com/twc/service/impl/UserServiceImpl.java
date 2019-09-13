package com.twc.service.impl;

import com.twc.dao.UserDao;
import com.twc.domain.User;
import com.twc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/13 16:26
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(int id) {
        return userDao.findOne(id);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }
}
