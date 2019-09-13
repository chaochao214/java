package com.twc.kethDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class _05properties {
    public static void main(String[] args)  throws IOException {
        Properties p  = new Properties();
        FileInputStream  fis = new FileInputStream("Day9\\test.properties");
        p.load(fis);
        fis.close();
        String username = p.getProperty("username");
        String password = p.getProperty("password");
        System.out.println(username+" "+password);
    }
}
