package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

/****
 * @Author:shenkunlin
 * @Date:2019/5/23 14:59
 * @Description:
 * @CacheNamespace(blocking = true):当前dao使用二级缓存
 *****/
@CacheNamespace(blocking = true)
public interface UserMapper {

    /***
     * <cache />
     * 根据用户名字查询用户信息
     * @param username
     */
    @Select("SELECT * FROM user WHERE username=#{username}")
    User getUserByUserName(String username);
}
