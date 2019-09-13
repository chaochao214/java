package com.twc.jlyi;

import com.twc.util.JdbcUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Map;

public class _02_02demo {
    public static void main(String[] args) {
        String sql = "CREATE TABLE product(pid INT PRIMARY KEY AUTO_INCREMENT, pname  VARCHAR(20),price DOUBLE)";
        //DataSource ds  = JDBCUtils.getDataSource();
        // JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
        //jdbcTemplate.execute(sql);

        JdbcTemplate jdbcTemplate  = new JdbcTemplate(JdbcUtils.getDataSource());
        /*jdbcTemplate.execute(sql);*/

       /* String sql2 = " INSERT INTO product VALUES(NULL,?,?); ";
        jdbcTemplate.update(sql2,"ipone3gs",3333);
        jdbcTemplate.update(sql2,"ipone4gs",4333);
        jdbcTemplate.update(sql2,"ipone5gs",5333);
        jdbcTemplate.update(sql2,"ipone5gs",5333);*/

//2
        /*String sq2 = "INSERT INTO USER VALUES (?,'twc','123','123','123')";
        jdbcTemplate.update(sq2,1);*/
 //3
       /* String sq3= "SELECT a.`nickname` FROM USER a WHERE a.id= '1'";
        String s = jdbcTemplate.queryForObject(sq3,String.class);
        System.out.println(s);*/


//4  4. 使用Jdbctemplate查询出第一条数据的所有信息并且封装到User对象
        String sq4="select *from user where user.id = 1 ";
        Map<String, Object> map1 = jdbcTemplate.queryForMap(sq4);
        User user1 = new User();
        user1.setUsername((String) map1.get("username"));
        user1.setUsername((String) map1.get("password"));
        user1.setUsername((String) map1.get("address"));
        user1.setUsername((String) map1.get("nickname"));
        System.out.println(user1);

        //5.5. 使用JdbcTemplate查询出所有的数据，封装到List<User>中
        String sql5= "select*from  user";

    }
}
