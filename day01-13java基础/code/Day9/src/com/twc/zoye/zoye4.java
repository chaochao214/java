package com.twc.zoye;

import java.io.FileInputStream;
import java.io.IOException;

public class zoye4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Day9\\c.txt");
        int b =-1;
        while((b= fis.read())!= -1){
            System.out.println( (char)b);
        }
        fis.close();
    }
}
