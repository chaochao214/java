package com.twc.service;

import com.twc.domain.User;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/13 16:25
 **/
public interface UserService {
    public List<User> findAll();
    public User findOne(int id);
    public void update(User user);


}
