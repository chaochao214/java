package dao;

import domin.Contact;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtil;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/4 10:04
 **/
public class ContactDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());

    /*
     查找所有的用户
     */
    public List<Contact> findAll() {
        String sql = "select*from contact";
        List<Contact> list = null;
        try {
            list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Contact.class));
        } catch (DataAccessException e) {
            e.printStackTrace();

        }
        return list;
    }

    /**
     * @return     */
    public Integer findCount() {
        String sql = "select count(*)from contact";
        Integer number = null;
        try {
            number = jdbcTemplate.queryForObject(sql, Integer.class);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return number;
    }
    //数据库进行分页查询

    /**
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<Contact> findContactByPage(Integer currentPage, Integer pageSize) {
        String sql = "select*from contact limit ?,?";
        List<Contact> list = null;
        try {
            list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Contact.class
            ), (currentPage - 1) * pageSize, pageSize);
        } catch (DataAccessException e) {
            //   e.printStackTrace();
        }
        return list;
    }
}
