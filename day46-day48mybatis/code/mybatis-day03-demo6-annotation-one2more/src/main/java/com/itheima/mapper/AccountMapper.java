package com.itheima.mapper;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Select;

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
    @Select("SELECT * FROM account WHERE uid=#{uid}")
    List<Account> getAccountByUserId(Integer uid);


}
