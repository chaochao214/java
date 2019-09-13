import com.twc.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Client {

    public static void main(String[] args) throws SQLException {
        Connection conn1  = JDBCUtil.getConnection();
        Connection conn2  = JDBCUtil.getConnection();
        Connection conn3  = JDBCUtil.getConnection();
        Connection conn4  = JDBCUtil.getConnection();
        Connection conn5  = JDBCUtil.getConnection();
        Connection conn6  = JDBCUtil.getConnection();
        Connection conn7  = JDBCUtil.getConnection();
        Connection conn8  = JDBCUtil.getConnection();
        Connection conn9 = JDBCUtil.getConnection();
        Connection conn10 = JDBCUtil.getConnection();
        conn1.close();
        Connection conn11 = JDBCUtil.getConnection();


}




}
