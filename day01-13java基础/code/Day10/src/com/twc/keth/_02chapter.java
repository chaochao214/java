package com.twc.keth;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _02chapter {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Day10\\demo2.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Day10\\demo2_1.txt"),"utf-8");
        int b;
        while((b=isr.read())!= -1){
            osw.write(b);
        }
        isr.close();
        osw.close();
    }
}
