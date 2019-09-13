package com.twc.SearchDemo;

import java.io.File;
import java.io.FileFilter;

public class Search2 {
    public static void main(String[] args) {
        File dir = new File("D:/java_code");
        File[] arr = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
               return  pathname.isFile()&& pathname.getName().endsWith(".java");
            }
        });
        for(File  file: arr){
            System.out.println(file);
            System.out.println(file.getName());
        }
    }
}
