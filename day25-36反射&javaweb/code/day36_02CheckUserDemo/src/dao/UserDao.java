package dao;

import domin.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtil;

/**
 * @Author: twc
 * @Date 2019/5/6 20:27
 **/
public class UserDao {
    public User findUserByUsername(String username) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());
        String sql = "select*from user where username = ? ";
        User user = null;
        try {
            user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username);
        } catch (DataAccessException e) {
          //  e.printStackTrace();

        }
        return user;
    }
}
