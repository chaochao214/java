package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/20 15:09
 * @Description:Dao层
 *               UserDao
 *****/
public interface UserDao {


    /*****
     * 根据用户ID查询用户信息
     * @param id
     */
    User findByUserId(Integer id);

    /****
     * 根据用户名模糊搜索用户信息
     * @param username
     */
    List<User> findByUserName(String username);


    /****
     * 添加用户信息
     * @param user
     */
    int saveUser(User user);

}
