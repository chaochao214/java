package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/20 15:09
 * @Description:Dao层
 *               UserDao
 *****/
public interface UserMapper {


    /***
     * SELECT * FROM USER WHERE ID IN(1,2,23)
     * @param ids:要查询的用户ID
     */
    List<User> findUserForeach(int[] ids);


    /****
     * if条件判断搜索
     * 根据用户输入的信息搜索用户
     * @param user
     */
    List<User> findUserWhere(User user);

    /****
     * if条件判断搜索
     * 根据用户输入的信息搜索用户
     * @param user
     */
    List<User> findUserIf(User user);




}
