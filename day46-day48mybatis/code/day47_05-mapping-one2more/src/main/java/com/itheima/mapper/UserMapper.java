package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/22 18:10
 * @Description:
 *****/
public interface UserMapper {

    /***
     * 一对多查询实现
     * @param id:用户ID
     */
    User one2More(Integer id);

    User one2More2(Integer id);

    List<User> findUserAccountList();


}
