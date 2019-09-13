package com.twc.fileDemo;

import java.io.File;

public class FileFor {


    public static void main(String[] args) {
        File f  = new File("D:/java_code");
        String[] str =  f.list();
        for(String s: str){
            System.out.println( s);
        }
    }
}
