package com.zoye.kovj.kovj3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8484);
        System.out.println("等待上传");
        SimpleDateFormat simp = new SimpleDateFormat( "时间ddHHmmss_");
        String s=simp.format(new Date());
        while (true) {
            new Thread(() -> {
                try {
                    Socket ac = ss.accept();

                    BufferedInputStream bis = new BufferedInputStream(ac.getInputStream());
                    String outPath =  "day11\\"+ s+ System.currentTimeMillis()+".jpg";
                    System.out.println(outPath);
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outPath));

                    int b = -1;
                    while ((b = bis.read()) != -1) {
                        bos.write(b);
                    }
                    System.out.println("图片上传成功");

                    bos.close();
                    bis.close();
                    ss.close();

                } catch (Exception e) {
                    e.printStackTrace();

                }
            }).start();
        }

    }
}
