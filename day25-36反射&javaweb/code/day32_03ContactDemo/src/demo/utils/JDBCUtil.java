package demo.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 包名:com.itheima.utils
 * 作者:Leevi
 * 日期2018-06-21  11:55
 *
 * 改变获取连接的方法:改为从C3P0连接池中获取
 */
public class JDBCUtil {
    private static DataSource ds;
    static {
        ds = new ComboPooledDataSource();
    }
    public static Connection getConnection() throws SQLException {
        //需要连接，从ds中获取
        return ds.getConnection();
    }
    public static DataSource getDataSource(){
        return ds;
    }
    public void close(ResultSet rst, Statement stm,Connection conn){
        if (rst != null){
            try {
                rst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(stm,conn);
    }
    public void close(Statement stm,Connection conn){
        if (stm != null) {
            try {
                stm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
