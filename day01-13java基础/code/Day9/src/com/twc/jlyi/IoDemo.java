package com.twc.jlyi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo {
    public static void main(String[] args) throws IOException {
        //使用file对象创建流对象
        File file = new File("Day9.txt");
        FileOutputStream fos = new FileOutputStream("Day9.txt");

        System.out.println(file.getAbsolutePath());

        byte[] b = "abcde".getBytes();
        byte[] words= {97,98,99,100,101};
        for (int i = 0; i < words.length; i++) {
            fos.write(words[i]);
            fos.write("\r\n".getBytes());
        }
        //关闭资源
        fos.close();
    }
}
