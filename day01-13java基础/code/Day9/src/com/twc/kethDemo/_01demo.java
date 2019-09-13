package com.twc.kethDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _01demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis  =new FileInputStream("Day9\\aa.txt");

        FileOutputStream fos =  new FileOutputStream( "Day9\\bb.txt",true);
        int b =-1;

        while((b=fis.read())!= -1){
            System.out.print(b);
            fos.write(b);
        }
        fos.write('*');
        fis.close();
        fos.close();
    }

}
