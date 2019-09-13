package com.zoye.kovj.kovj2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket  ss  = new ServerSocket(8888);
        Socket ac = ss.accept();
        BufferedInputStream bis  = new BufferedInputStream(ac.getInputStream());
        BufferedOutputStream  bos = new BufferedOutputStream(new FileOutputStream("day11\\zoye5.jpg"));
        int len =-1;
        byte[] arr  = new byte[1024];
        while((len=bis.read(arr))!= -1){
            bos.write(arr,0,len);
        }
        bos.close();
        bis.close();
        ss.close();

    }
}
