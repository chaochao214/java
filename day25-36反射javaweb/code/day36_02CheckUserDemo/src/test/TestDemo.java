package test;

import domin.User;
import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtil;

/**
 * @Author: twc
 * @Date 2019/5/15 9:20
 **/
public class TestDemo {
    @Test
    public void test10() {
        JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());
        String username = "test";

        String sql = "select*from user where username = ? ";

        User user = null;
        try {
            user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username);
        } catch (DataAccessException e) {
        //     e.printStackTrace();

        }
        System.out.println(user);
    }
}
