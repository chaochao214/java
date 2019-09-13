package com.twc.zoye;

import java.io.FileInputStream;
import java.io.IOException;

public class zoye5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Day9\\b.txt");

        byte[]  arr = "test".getBytes();
        int part = -1;
        while( (part = fis.read(arr))!= -1){
            System.out.println(new String(arr,0,part));
        }
        fis.close();
    }
}
