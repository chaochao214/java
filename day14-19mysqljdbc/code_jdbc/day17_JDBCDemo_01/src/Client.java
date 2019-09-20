import java.sql.*;

public class Client {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.实现低耦合
        // 找不到这个文件这么办啊
        Class.forName("com.mysql.jdbc.Driver");

        String url ="jdbc:mysql:///day17";
        String user = "root";
        String password ="root";

        //3.创建statement对象
        Connection conn  = DriverManager.getConnection(url,user,password);
        String sql = "select*from user";
        Statement stm  = conn.createStatement();

        // 执行sql
        ResultSet rst = stm.executeQuery(sql);

        while(rst.next()){
            int  id = rst.getInt("id");
            String  username = rst.getString("name");
            String  pwd = rst.getString("password");

            System.out.println(id+ username + pwd );


        }
        rst.close();
        stm.close();
        conn.close();
    }

}
