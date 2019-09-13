package com.itheima.mapper;

import com.itheima.domain.Account;

/****
 * @Author:shenkunlin
 * @Date:2019/5/23 14:58
 * @Description:
 *****/
public interface AccountMapper {

    /***
     * 根据ID查询账号信息
     * @param id:账号ID
     */
    Account getAccountById(Integer id);


    Account getAccountById2(Integer id);

}
