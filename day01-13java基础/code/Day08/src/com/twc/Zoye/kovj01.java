package com.twc.Zoye;

import java.io.File;
import java.util.Scanner;

public class kovj01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件路径：");
        String path = sc.nextLine();
        File file = new File(path);
        if(file.isFile()){
            System.out.println( "文件的大小为"+file.length());

        }
        if(file.isDirectory()){
            File[] f= file.listFiles();
            int size  = 0;
            for (File f2 : f) {
                if(f2.isFile()) size+=f2.length();

            }
            System.out.println("文件夹的所有文件之和是："+size);
        }

    }
}
