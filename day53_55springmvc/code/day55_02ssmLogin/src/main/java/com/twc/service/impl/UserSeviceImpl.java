package com.twc.service.impl;

import com.twc.Dao.UserDao;
import com.twc.domain.User;
import com.twc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: twc
 * @Date 2019/6/4 9:34
 **/
@Service
public class UserSeviceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int saveUser(User user) {
         return  userDao.save(user);
    }
}
