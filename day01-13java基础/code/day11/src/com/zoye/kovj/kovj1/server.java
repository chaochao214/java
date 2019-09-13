package com.zoye.kovj.kovj1;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8002);
        Socket sc = ss.accept();

        BufferedOutputStream bos  = new BufferedOutputStream(sc.getOutputStream());
        bos.write("helloworld".getBytes());
        bos.close();
        sc.close();
    }
}
