package login.dao;

import login.domain.User;
import login.utils.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author: twc
 * @Date 2019/5/3 9:20
 **/
public class Dao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());

    public User checkLogin(String username, String password) {
        String sql = "select * from user where username=? and password =?";
        User user = null;
        try {
            user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username, password);

        } catch (DataAccessException e) {
            //e.printStackTrace();
        }
        return user;
    }

    public boolean insertUser(String username, String password, String nickname) {
        String sql = "insert into user(username,password,nickname)  values (?,?,?) ";
        int i = jdbcTemplate.update(sql, username, password, nickname);
        boolean flag = false;
        if(i==1){
            flag  = true;
        }
        return  flag;
    }
}
