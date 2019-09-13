package com.twc.digv;

import java.io.File;

public class difvFile {
    public static void main(String[] args) {
        File dir  = new File("d:/java_code");
        method(dir);
    }

    private static void method(File dir) {
        File[]  arr = dir.listFiles();
        if(arr!=null){
            for(File file:arr){
                if(file.isDirectory()){
                    System.out.println(file.getAbsolutePath());
                    method(file);
                }
                if(file.isFile()){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

}
