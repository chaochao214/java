package demo.web3.dao;

import demo.web3.domain.User;
import demo.web3.utils.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 包名:com.itheima.dao
 * 作者:Leevi
 * 日期2019-04-23  17:07
 * 负责处理数据库的增删改查，由业务层调用
 */
public class UserDao {
    /**
     * 数据库的查询操作:根据用户名和密码查询用户信息
     * @param username
     * @param password
     * @return
     */
    public User findUser(String username, String password){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());
        String sql = "select * from user where username=? and password=?";
        User user = null;
        try {
            user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username, password);
        } catch (DataAccessException e) {
            //e.printStackTrace();
        }
        return user;
    }

    /**
     * 添加用户的方法
     * @param user
     * @return
     */
    public boolean addUser(User user) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());
        String sql = "insert into user values (?,?,?,?)";
        int i = template.update(sql, user.getId(), user.getUsername(), user.getPassword(), user.getNickname());
        boolean flag = false;
        if (i == 1) {
            flag = true;
        }
        return flag;
    }
}
