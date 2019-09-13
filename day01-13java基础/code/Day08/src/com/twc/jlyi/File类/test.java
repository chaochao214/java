package com.twc.jlyi.File类;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File f = new File("D:\\java_code\\test");

       /* String[] fileName = f.list();
        for (String s : fileName){
            System.out.println(s);
        }*/
        lisF(f);

    }

    //   递归输出一个文件夹下所有的文件名字。
    public static void lisF(File file2) {
        File[] files = file2.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file);
            }
            if (file.isDirectory()) {
                lisF(file);
            }
        }
        System.out.println(file2);
    }

}
