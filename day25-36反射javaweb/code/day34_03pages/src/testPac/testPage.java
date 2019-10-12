package testPac;

        import org.junit.Test;
        import org.springframework.jdbc.core.JdbcTemplate;
        import utils.JDBCUtil;

/**
 * @Author: twc
 * @Date 2019/5/9 9:52
 **/
public class testPage {
    @Test
    public void testConnect(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());
        System.out.println(template.getDataSource());
    }
}
