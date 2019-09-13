package com.twc.Dao;

import com.twc.domain.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @Author: twc
 * @Date 2019/6/4 9:41
 **/
public interface UserDao {
     @Insert("insert into user(number,password,mobile)values(#{number},#{password},#{mobile})")
     int save(User user);
}
