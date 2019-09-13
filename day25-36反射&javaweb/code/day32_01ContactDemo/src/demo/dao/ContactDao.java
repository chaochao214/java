package demo.dao;

import demo.domain.Contact;
import demo.utils.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/4/26 11:23
 **/
public class ContactDao {
    JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());

    /**
     * 列出所有用户
     *
     * @return
     */
    public List<Contact> findAll() {
        String sql = "select * from contact";
        List<Contact> contacts = null;
        try {
            contacts = template.query(sql, new BeanPropertyRowMapper<>(Contact.class));
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    /**
     * 添加用户
     *
     * @param contact
     * @return
     */
    public boolean add(Contact contact) {
        String sql = "insert into contact values (?,?,?,?,?,?,?) ";
        int flag = template.update(sql, contact.getId(), contact.getName(), contact.getSex(), contact.getAge(), contact.getAddress(), contact.getQq(), contact.getEmail());

        if (flag == 1) {
            return true;
        } else {

            return false;
        }
    }


    public boolean update(Contact contact) {
        String sql = "update contact set name=?,sex=?,age=?,address=?,qq=?,email=? where id =?";
        int i = template.update(sql, contact.getName(), contact.getSex(), contact.getAge(), contact.getAddress(), contact.getQq(), contact.getEmail(), contact.getId());
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean del(String id) {
        String sql = "delete from contact where id=?";
        int update = template.update(sql, id);
        boolean flag = false;
        if (update == 1) {
            flag = true;
        }
        return flag;
    }

    public Integer findCount() {
        String sql = "select count(*) from contact";
        Integer count = null;
        try {
            count = template.queryForObject(sql, Integer.class);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return count;

    }

    public List<Contact> findContactByPage(Integer currentPage, Integer pageSize) {
        String sql = "select*from contact  limit  ?,?";
        List<Contact> list = null;
        try {
            list = template.query(sql, new BeanPropertyRowMapper<>(Contact.class), (currentPage - 1) * pageSize, pageSize);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return  list;
    }
}
