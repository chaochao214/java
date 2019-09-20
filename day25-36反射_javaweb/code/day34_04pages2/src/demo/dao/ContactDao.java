package demo.dao;

import com.alibaba.druid.sql.visitor.functions.Concat;
import demo.utils.JDBCUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/9 10:26
 **/
public class ContactDao {

    JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());

    public Integer findTotalSize() {
        String sql = "select*from contact";
        Integer i = template.queryForObject(sql, Integer.class);
        return i;
    }

    public List<Concat> findListTotal(Integer currentPage, Integer pageSize) {
        String sql = "select*from  contact limit ?,?";
        List<Concat> list = (List<Concat>) template.queryForObject(sql, new BeanPropertyRowMapper<>(Concat.class), (currentPage - 1) * pageSize, pageSize);
        return list;
    }
}
