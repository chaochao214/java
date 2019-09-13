import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TestJdbcTemple{
     private JdbcTemplate template;
     @Before
     public void init(){
          System.out.println( "执行代码之前");
          template = new JdbcTemplate(JDBCUtil.getDataSource());
     }
     @After
     public void destroy(){
          System.out.println("测试方法执行完毕");

     }
     @Test
     public void testInsert(){
          String sql = "insert into user values  (null,?,?,?,?)";
          int i  = template.update(sql,"ls","8888","广州","四川");
          System.out.println(i);
     }
     @Test
     public void testQueryOne(){
           String sql ="select  nickname from user where id = ?";
           String nickname  = template.queryForObject(sql,String.class,4);
           System.out.println(nickname);
     }
     @Test
     public void testQueryObeRow(){
          String sql = "select  nickname from user where id = ?";
          Map<String, Object> map = template.queryForMap(sql, 4);
          System.out.println(map);
     }

     /**
      * public interface RowMapper<T> {
      *     T mapRow(ResultSet var1, int var2) throws SQLException;
      * }
      */
     @Test
     public void testQueryOneRowForBean(){
           String sql ="select*from user where id =?";
          User user = (User) template.queryForObject(sql, new RowMapper<Object>() {

               @Override
               public User mapRow(ResultSet resultSet, int i) throws SQLException {
                    User user = new User();
                    int id = resultSet.getInt("id");
                    user.setId(id);
                    String username = resultSet.getString("username");
                    String password = resultSet.getString("password");
                    user.setUsername(username);
                    user.setPassword(password);
                    return user;
               }
          }, 2);
          System.out.println(user);
     }
     @Test
     public  void testQueryForOneRow2(){
          String sql = "select*from user where id=?";
          User user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 4);
          System.out.println(user);
     }
     @Test
     public void testQueryOneColumn(){
          //查询一列数据，要查询所有用户的nickname
          String sql = "select nickname from user";
          //查询一列数据封装到一个集合中
          List<String> nicknames = template.queryForList(sql, String.class);
          System.out.println(nicknames);
     }
     @Test
     public void testQueryRows(){
          //查询多行数据
          //返回值是List<Map<String,Object>>
          String sql = "select * from user where id>?";
          List<Map<String, Object>> maps = template.queryForList(sql, 0);

          System.out.println(maps);
     }

     @Test
     public void testQueryRows2(){
          //查询多行数据
          //很重要
          //返回值是List<Bean>
          String sql = "select * from user where id>?";
          List<User> users = template.query(sql, new BeanPropertyRowMapper<>(User.class), 0);

          System.out.println(users);
     }

}
