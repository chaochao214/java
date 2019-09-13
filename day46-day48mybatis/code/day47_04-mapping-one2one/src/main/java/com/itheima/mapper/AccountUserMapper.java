package com.itheima.mapper;

import com.itheima.domain.Account;
import com.itheima.domain.AccountUser;
import com.itheima.domain.AccountUser2;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/22 18:10
 * @Description:
 *****/
public interface AccountUserMapper {

    /***
     * 一对一查询
     * 继承关系实现
     * @param id
     * @return
     */
    AccountUser one2oneExt(Integer id);


    /***
     * 一对一实现
     * @param id:账号ID
     */
    Account one2one(Integer id);


    /**
     *  614copy
     */
    AccountUser2 one2oneExt2(Integer id);


    List<Account> one2one2(Integer id);


    List<Account> findAccountList2(Integer id);

}
