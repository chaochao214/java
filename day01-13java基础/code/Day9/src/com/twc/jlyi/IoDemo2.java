package com.twc.jlyi;

import java.io.*;

public class IoDemo2 {
    public static void main(String[] args) throws IOException {
        //使用文件名创建流对象
        File file   =  new File("Day9_2.txt");
        file.createNewFile();
        FileOutputStream fos  = new FileOutputStream(file);
        fos.write("twccccccccccccccccccc".getBytes());
        FileInputStream  fis  =  new FileInputStream(file);
        //读取数据，返回下一个字节
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        fos.close();
    }
}
