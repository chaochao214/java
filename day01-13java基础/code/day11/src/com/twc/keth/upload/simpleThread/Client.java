package com.twc.keth.upload.simpleThread;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
       // Socket s = new Socket("192.168.70.117",8989);
        Socket s = new Socket("localhost",8989);
        //Socket s = new Socket("127.0.0.1",8888);
        // 从硬盘读入数据

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day11\\sstu.jpg"));
        BufferedOutputStream  bos = new BufferedOutputStream(s.getOutputStream());
        int b ;
        while((b = bis.read())!= -1){
            bos.write(b);
        }
        System.out.println(Thread.currentThread().getName()+  "传输完成");

        bos.close();
        bis.close();
        s.close();
    }
}
