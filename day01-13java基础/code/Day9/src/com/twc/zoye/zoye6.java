package com.twc.zoye;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class zoye6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis  = new FileInputStream("Day9\\a1.jpg");
        FileOutputStream fos  = new FileOutputStream("Day9\\a2.jpg");
        int len  =-1;
        while(( len= fis.read())!= -1 ){
            // write之中len 具体指的是那些？
            fos.write(len);
        }
        fis.close();


    }
}
