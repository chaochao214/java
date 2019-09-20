package demo.dao;

import demo.domain.User;
import demo.utils.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author: twc
 * @Date 2019/4/24 10:01
 **/
public class UserDao {

    public User findUser(String username, String password) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());
        String sql = "select*from user where username=? and  password=?";
        User user = null;
        try {
            user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username, password);
        } catch (DataAccessException e) {
            // e.printStackTrace();
        }
        return user;
    }

    public boolean addUser(User user) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());
        String sql = "insert into user values (?,?,?,?)";
        int i = template.update(sql, user.getId(), user.getUsername(),
                user.getPassword(), user.getNickname());

        boolean flag = false;
        if (i == 1) {
            flag = true;
        }
        return flag;
    }
}
