package com.twc.zoye;

import java.io.FileInputStream;
import java.io.IOException;

public class kovj1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Day9\\kovj1.txt");
        int count =0,len   =-1;
        while((len = fis.read())!= -1){
            if(len == 'a'){
                count ++;
            }
        }
        System.out.println( "a出现的次数"+count);
    }
}
