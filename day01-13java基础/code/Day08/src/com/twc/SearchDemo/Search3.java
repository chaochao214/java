package com.twc.SearchDemo;

import java.io.File;

public class Search3 {
    public static void main(String[] args) {

    }

    public static void printDir3(File dir) {
        // lamda改写
        File[] files = dir.listFiles(f -> {
            return f.getName().endsWith(".java") || f.isDirectory();
        });
        //循环打印
        for(File file : files){
            System.out.println(file.getAbsolutePath());
        }


    }
}
