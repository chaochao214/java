package com.twc.zoye;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class zoye5 {
    public static void main(String[] args) throws Exception{
        //输入流练习 zoye5
        String s = "这是一段话";
        FileOutputStream fos  = new FileOutputStream( "Day10\\zoye5.txt");
        OutputStreamWriter osw  = new OutputStreamWriter(fos,"gbk");
        osw.write(s);
        osw.close();

        // 输出流练习  zoye6
        FileInputStream fis = new FileInputStream("Day10\\zoye5.txt");
        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        char[] buffer = new char[2];
    //为什么输出的结果是数字
        int b  = -1;
        while((b=isr.read(buffer))!=-1){
           // System.out.println( b);
            System.out.println(new String(buffer, 0,b));
            System.out.println();

        }
         isr.close();

    }

}
