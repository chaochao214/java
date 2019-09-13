package demo.testPac;

import demo.utils.JDBCUtil;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author: twc
 * @Date 2019/5/9 9:52
 **/
public class testPage {
    @Test
    public void testConnect() {
        JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());
    }

}
