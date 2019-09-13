package com.itheima.mapper;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
    @Select("SELECT * FROM account WHERE id=#{id}")
    @Results(
        id = "AccountResultMap",
        value = {
                @Result(id = true, column="id",property="id"),
                @Result(column="money",property="money"),
                @Result(column="uid",property="uid"),
                @Result(property = "user",
                        column="uid",
                        one = @One(
                                select="com.itheima.mapper.UserMapper.getUserById"
                        )
                )
        }
    )
    Account getAccountById(Integer id);


}
