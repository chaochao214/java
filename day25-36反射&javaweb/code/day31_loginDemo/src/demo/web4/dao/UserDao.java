package demo.web4.dao;

import demo.web4.bean.User;
import demo.web4.utils.JDBCUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author: twc
 * @Date 2019/4/27 15:29
 **/
public class UserDao {
    public User findUser(String username,String password){
         String sql = "select*from user where username=? and  password = ?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());
        User  user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(), username, password);
        return  user;

    }
}
