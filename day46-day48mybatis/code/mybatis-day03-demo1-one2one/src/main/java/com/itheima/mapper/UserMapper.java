package com.itheima.mapper;

import com.itheima.domain.User;

/****
 * @Author:shenkunlin
 * @Date:2019/5/23 14:59
 * @Description:
 *****/
public interface UserMapper {


    /****
     * 根据用户Id查询用户信息
     * @param id:用户ID
     */
    User getUserById(Integer id);
}
