package com.twc.dao;

import com.twc.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: twc
 * @Date 2019/6/13 16:24
 **/
public interface UserDao extends JpaRepository<User,Integer> {

}
