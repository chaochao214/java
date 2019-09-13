package com.itheima.mapper;

import com.itheima.domain.Role;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/14 10:52
 **/
public interface RoleMapper {
     List<Role> findRoleUserList();
}
