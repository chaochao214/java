package com.zoye.zoye5;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket  ss = new ServerSocket(8888);
        Socket soc = ss.accept();
        BufferedInputStream bis = new BufferedInputStream(soc.getInputStream());
        int len= -1;
        byte[] bytes  = new byte[1024];

        while((len=bis.read(bytes))!=-1){
            System.out.println( new String(bytes,0,len));
        }
        bis.close();

    }
}
