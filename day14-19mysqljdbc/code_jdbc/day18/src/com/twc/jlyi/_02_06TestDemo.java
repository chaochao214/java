package com.twc.jlyi;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class _02_06TestDemo {
    public static void main(String[] args) throws IOException, SQLException {
        _02_2datapool  myPool = new _02_2datapool();
        System.out.println("1"+myPool.getConnection());
        System.out.println("1"+myPool.getConnection());
        System.out.println("1"+myPool.getConnection());
        System.out.println("1"+myPool.getConnection());
        System.out.println("1"+myPool.getConnection());
        System.out.println("1"+myPool.getConnection());
        System.out.println("1"+myPool.getConnection());
        Connection connection  = myPool.getConnection();
        myPool.close(connection);

    }
}
