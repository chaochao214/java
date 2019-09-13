package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

/****
 * @Author:shenkunlin
 * @Date:2019/5/23 14:59
 * @Description:
 *****/
public interface UserMapper {

    /***
     * 根据用户名字查询用户信息
     * @param username
     */
    @Select("SELECT * FROM user WHERE username=#{username}")
    @Results(
            id = "UserResultMap",
            value = {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "username", property = "username"),
                    @Result(column = "sex", property = "sex"),
                    @Result(column = "birthday", property = "birthday"),
                    @Result(column = "address", property = "address"),
                    @Result(property="accounts",
                            column="id",
                            many = @Many(
                                    select="com.itheima.mapper.AccountMapper.getAccountByUserId",
                                    fetchType = FetchType.EAGER)
                    )
            }

    )
    User getUserByUserName(String username);
}
