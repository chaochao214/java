package com.demo.mapper;

import com.demo.domain.QueryVo;
import com.demo.domain.User;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/20 20:10
 **/
public interface UserMapper {
    List<User> findAll();

    int saveUser(User user);

    int updateUser(User user);


    List<User> findUserByUsername(String username);

    /**
     *  根据用户名查找用户
     * @param vo
     * @return
     */
    /*User findByVo(QueryVo vo);*/

    /**
     * 613 review
     **/

    int saveUser2(User user);

    int updateUser2(User user);

    int deleteUser2(int id);

    User findByVo2(QueryVo vo);


}

