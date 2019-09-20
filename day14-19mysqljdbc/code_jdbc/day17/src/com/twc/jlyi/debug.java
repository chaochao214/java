package com.twc.jlyi;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class debug {
    public static void main(String[] args) throws Exception {
        Properties  pp  = new Properties();
        InputStream is = debug.class.getResourceAsStream("/b.properties");
        //pp.load(new FileInputStream("Day17\\a.properties"));
        pp.load( is);
        System.out.println(pp.getProperty("user1"));





        /*pp.setProperty("key1","value1");
        pp.setProperty("key2","value2");
        pp.setProperty("key3","value3");
        System.out.println( pp);*/
    }
}
