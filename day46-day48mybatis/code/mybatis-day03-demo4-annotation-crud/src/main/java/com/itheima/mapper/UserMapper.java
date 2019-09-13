package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/****
 * @Author:shenkunlin
 * @Date:2019/5/23 14:59
 * @Description:
 *****/
public interface UserMapper {

    /****
     * 增加用户
     * @param user
     */
    @Insert("INSERT INTO user(username,sex,birthday,address) VALUES(#{username},#{sex},#{birthday},#{address})")
    int addUser(User user);

    /****
     * 根据ID修改数据
     * id=#{id},username=#{username}
     * @param user
     */
    @Update("UPDATE user SET username=#{username},sex=#{sex},birthday=#{birthday},address=#{address} WHERE id=#{id}")
    int updateUser(User user);


    /****
     * 删除
     * @param id
     */
    @Delete("DELETE FROM user WHERE id=#{id}")
    int deleteUser(Integer id);

    /****
     * 查询
     */
    @Select("SELECT * FROM user")
    List<User> list();
}
