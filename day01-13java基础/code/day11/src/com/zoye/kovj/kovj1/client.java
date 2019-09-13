package com.zoye.kovj.kovj1;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket s  = new Socket("127.0.0.1",8002);
        FileInputStream fis  = (FileInputStream) s.getInputStream();
        int len =-1;
        byte[] bytes  = new byte[1024];
        while((len= fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        s.close();


    }
}
