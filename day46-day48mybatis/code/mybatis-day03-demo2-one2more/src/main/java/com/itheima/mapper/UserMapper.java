package com.itheima.mapper;

import com.itheima.domain.User;

/****
 * @Author:shenkunlin
 * @Date:2019/5/23 14:59
 * @Description:
 *****/
public interface UserMapper {

    /***
     * 根据用户名字查询用户信息
     * @param username
     */
    User getUserByUserName(String username);


    User getUserByUserId(Integer id);
}
