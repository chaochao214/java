package com.twc.zoye;

import java.io.FileOutputStream;
import java.io.IOException;

public class zoye3 {
    public static void main(String[] args)throws IOException {
        //FOS 如何不新建一个文件
        FileOutputStream fos  = new FileOutputStream("Day9\\c.txt",true);
        byte[] arr = "i love java\r \n".getBytes();
        fos.write(arr);
        fos.write(arr);
        fos.write(arr);
        fos.write(arr);
        fos.write(arr);
        fos.close();

    }
}
