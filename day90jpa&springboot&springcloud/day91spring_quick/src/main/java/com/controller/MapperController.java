package com.controller;

import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/8/9 9:23
 **/
@Controller
public class MapperController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/queryUser")
    @ResponseBody
    public  List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return  users;

    }
}
