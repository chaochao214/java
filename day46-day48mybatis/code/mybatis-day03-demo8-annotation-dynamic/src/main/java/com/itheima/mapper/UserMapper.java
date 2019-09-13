package com.itheima.mapper;

import com.itheima.domain.User;
import com.itheima.util.SqlAppendUtil;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/23 14:59
 * @Description:
 * @CacheNamespace(blocking = true):当前dao使用二级缓存
 *****/
@CacheNamespace(blocking = true)
public interface UserMapper {

    /***
     * 根据用户名字查询用户信息
     * method="方法名:组装SQL语句的方法名"
     * type=T.class:表示组装SQL语句的方法所在的类
     * @param user
     */
    @SelectProvider(type = SqlAppendUtil.class ,method = "list")
    List<User> getUser(User user);
}
