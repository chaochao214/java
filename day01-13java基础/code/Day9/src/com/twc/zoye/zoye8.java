package com.twc.zoye;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class zoye8 {
    public static void main(String[] args) throws IOException {
        Properties p =new Properties();
        FileInputStream fis  = new FileInputStream( "Day9\\zoye8.txt");
        p.load(fis);
        Set<String> keys = p.stringPropertyNames();
        for(String key:keys){
            if("lisi".equals(key)){
                p.setProperty(key," 100");
            }
        }
        p.store(new FileOutputStream("Day9\\zoye9.txt"),"haha");
    }
}
