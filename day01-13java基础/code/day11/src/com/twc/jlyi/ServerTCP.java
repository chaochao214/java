package com.twc.jlyi;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动，等待连接。。");
        //创建serverSocket对象，绑定端口，开始等扥连接
        ServerSocket ss = new ServerSocket(6666);
        //接收连接accept方法，返回socket对象
        Socket server = ss.accept();
        //通过Socket 获取输入流
        InputStream is = server.getInputStream();
        // 获取输入流，读取数据
        byte[] b = new byte[1024];
        int len = is.read(b);

        String msg = new String(b, 0, len);
        System.out.println(msg);

        is.close();
        server.close();
    }
}
