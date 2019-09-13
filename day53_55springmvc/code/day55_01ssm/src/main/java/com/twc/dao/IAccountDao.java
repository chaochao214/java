package com.twc.dao;

import com.twc.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/3 10:52
 **/
//为什么这里可加可不加
@Repository
public interface IAccountDao {

    @Select(value = "select*from account")
    List<Account> findAll();

    @Insert(value = "insert into account(name,money) values (#{name},#{money})")
    void save(Account account);


}
