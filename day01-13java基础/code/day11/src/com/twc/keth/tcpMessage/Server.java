package com.twc.keth.tcpMessage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket  ss= new ServerSocket(8888);
        System.out.println("服务器正在等待用户连接。。。");
        Socket  socket   = ss.accept();
        System.out.println("服务器收到了连接");

        InputStream is =socket.getInputStream();

        byte[] arr = new byte[1024];
        int len = is.read(arr);
        //获取输入的连接问题。
        System.out.println( new String(arr,0,len));
        //回写

        OutputStream os  = socket.getOutputStream();
        System.out.println("服务器输出回流");
        os.write("我拒绝你的输出".getBytes());

        is.close();
        socket.close();
        ss.close();
    }
}
