package com.mapper;
import com.entity.User;
import  org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/8/9 9:12
 **/
@Mapper
public  interface UserMapper {
     public List<User> queryUserList();
}
