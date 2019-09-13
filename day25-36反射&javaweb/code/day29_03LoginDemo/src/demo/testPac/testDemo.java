package demo.testPac;

import demo.utils.JDBCUtil;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author: twc
 * @Date 2019/5/9 8:58
 **/
public class testDemo {
    @Test
    public  void testCOnnect(){
        JdbcTemplate template  = new JdbcTemplate(JDBCUtil.getDataSource());
        System.out.println(template);
    }
}
