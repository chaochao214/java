package com.twc.kethDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//异常处理问题。
public class _04demo  {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos= null;
        try{
            fis = new FileInputStream("Day9\\aaa.txt");
            fos = new FileOutputStream("Day9\\bbb.txt");

        }
        finally{

        }
    }

}
