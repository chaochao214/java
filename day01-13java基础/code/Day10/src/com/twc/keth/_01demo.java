package com.twc.keth;

import java.io.*;

public class _01demo {
    public static void main(String[] args) throws IOException {
        // 字节缓冲流，带缓冲区的字节缓冲对象。
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Day10\\a1.jpg"));
        BufferedOutputStream bos  = new BufferedOutputStream(new FileOutputStream("Day10\\a2.jpg"));
        int b =-1;
        while((b=bis.read())!= -1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }


}
