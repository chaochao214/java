package com.twc.jlyi;

public class _07chapter {
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql:///day17";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    static{
        try{

            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
