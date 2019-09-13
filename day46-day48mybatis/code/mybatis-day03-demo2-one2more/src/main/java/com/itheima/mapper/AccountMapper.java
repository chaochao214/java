package com.itheima.mapper;

import com.itheima.domain.Account;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/23 14:58
 * @Description:
 *****/
public interface AccountMapper {


    /***
     * 根据用户ID查询账号信息
     * @param uid
     */
    List<Account> getAccountByUserId(Integer uid);


}
