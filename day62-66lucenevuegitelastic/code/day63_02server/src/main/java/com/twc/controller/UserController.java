package com.twc.controller;

import com.twc.domain.User;
import com.twc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/13 16:29
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll2() {
        System.out.println("测试输出");
        return userService.findAll();
    }

    //restful 风格接受id的属性值
    @RequestMapping("/findOne/{id}")
    public  User findOne(@PathVariable("id")Integer id){

        User one = userService.findOne(id);
        System.out.println("aaa" +one);
        return  one;
    }
    @RequestMapping("/update")
    public void update(@RequestBody User user){
          userService.update(user);
    }

}
