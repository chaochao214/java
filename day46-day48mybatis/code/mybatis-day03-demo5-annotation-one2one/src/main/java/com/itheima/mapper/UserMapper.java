package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

/****
 * @Author:shenkunlin
 * @Date:2019/5/23 14:59
 * @Description:
 *****/
public interface UserMapper {


    /****
     * 根据用户Id查询用户信息
     * @param id:用户ID
     */
    @Select("SELECT * FROM user WHERE id=#{id}")
    User getUserById(Integer id);
}
