package com.twc.zoye;

import java.io.FileOutputStream;
import java.io.IOException;

public class zoye1 {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos  =  new FileOutputStream("Day9\\aa.txt");
        //为什么不能带数字零
        char[]  arr  = "i love java".toCharArray();
        byte[]  arr2 = " i love java".getBytes();
        fos.write(arr2);
        fos.close();

    }
}
