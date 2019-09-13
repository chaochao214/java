package com.twc.jlyi.tcp2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTcp {
    public static void main(String[] args) throws IOException {
        System.out.println( "服务端启动，等待连接。。");
        ServerSocket ss  = new ServerSocket(6666);
        //接受连接accept方法，返回socket对象
        Socket server = ss.accept();
        //3 通过socket获取输入值
        InputStream is =server.getInputStream();
        //4. 一次性读取数据
        byte[] b  = new byte[1024];
        // 数据读取到字中
        int len = is.read(b);
        String msg  = new String(b,0,len);
        System.out.println( msg);
        //回写数据
        // 通过socke获取输出流
        OutputStream out = server.getOutputStream();
        out.write("我很好".getBytes());
        //关闭资源

        System.out.println("服务端关闭");
        out.close();
        is.close();
        server.close();
     }
}
