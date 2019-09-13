package com.twc.zoye;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class zoye1 {
    public static void main(String[] args) throws Exception {
       /* BufferedReader br = new BufferedReader(new FileReader("Day10\\copy.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Day10\\copy.txt"));

        //??   答案为什么是空？
        String line=null;
        while((line=br.readLine())!=null){bw.write(line);}
        bw.close();
        br.close();*/
        FileOutputStream fos = new FileOutputStream("Day10\\a3.jpg");
        BufferedOutputStream bos  = new BufferedOutputStream(fos);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Day10\\a1.jpg"));
        int b  = -1;
        while((b=bis.read())!= -1){
            bos.write(b);
        }

        bos.write( "i love jav".getBytes());
        bos.write( 97);
        bos.close();



    }
}
