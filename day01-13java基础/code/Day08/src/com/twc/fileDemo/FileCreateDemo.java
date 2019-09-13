package com.twc.fileDemo;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {
    public static void main(String[] args) throws IOException {
        //文件的创建
        File f =  new File("D:/java_code/test/bb.txt");
        System.out.println( f.exists());
        System.out.println(f.createNewFile());
        System.out.println(f.exists());
        //目录的创建
        File f2  = new File("D:/java_code/test/newDir");
        System.out.println(f2.exists());
        System.out.println(f2.mkdir());
        System.out.println(f2.exists());
        System.out.println("------------------");
        //创建多级目录
        File f3= new File("newDira\\newDirb");
        System.out.println(f3.mkdir());

        File f4= new File("newDira\\newDirb");
        System.out.println(f4.getAbsolutePath());
        System.out.println(f4.mkdirs());
        System.out.println(f4.delete());
    }
}
