package com.itheima.mapper;

import com.itheima.domain.User;

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
    User more2More(Integer id);


}
