package com.twc.SearchDemo;

import java.io.File;

public class Search {
    public static void main(String[] args) {
        ///？？？ 报错：栈内存溢出

        File f = new File("d:/java_code");
        method(f);
    }

    private static void method(File f) {
        File[] str = f.listFiles();
        if (str != null) {
            for (File file : str) {
                if (file.isFile() && file.getName().endsWith(".java")) {
                    System.out.println(file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    method(file);
                }

            }
        }

    }
}
