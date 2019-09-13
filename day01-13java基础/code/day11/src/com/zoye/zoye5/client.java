package com.zoye.zoye5;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket s   = new Socket("127.0.0.1",8888);
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
        bos.write("你好".getBytes());
        bos.close();
        s.close();
    }
}
