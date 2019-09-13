package com.twc.keth.upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        ServerSocket ss = new ServerSocket(8089);

        while (true) {
            System.out.println("服务器等待连接");
            Socket s = ss.accept();

            new Thread(() -> {
                try {
                    System.out.println("连接成功");
                    BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
                    //每一个文件都保存在不同的位置
                    /* String name="day11\\"+System.currentTimeMillis()+".jpg";*/
                    SimpleDateFormat sdp = new SimpleDateFormat("ddHHmmss_");
                    String name2 = "day11\\" + sdp.format(new Date())+System.currentTimeMillis() + ".jpg";

                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(name2));
                    int b = -1;
                    System.out.println("传输中");
                    //copy 文件的代码
                    while ((b = bis.read()) != -1) {
                        bos.write(b);
                    }
                    System.out.println("传输完毕");
                    bos.close();
                    bis.close();
                    //??  serverSocket 不需要关闭
                  //  ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
