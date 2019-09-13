package com.twc.keth.tcpMessage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ip);
        //创建socket 对象
        Socket socket  = new Socket("127.0.0.1",8989);
        //服务器连接的输出流
        OutputStream os=  socket.getOutputStream();
        os.write("test".getBytes());
        //--回流

        InputStream is=  socket.getInputStream();
        byte[] arr = new byte[1024];
        int len= is.read(arr);
        System.out.println(new String(arr,0,len));

        os.close();
        socket.close();
    }
}
