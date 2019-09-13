package com.twc.jlyi.tcp2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTcp {
    public static void main(String[] args) throws IOException {
        System.out.println( "客户端 发送数据");
        // 1.创建socket要发送到哪里
        Socket client  = new Socket("localhost",6666);
        OutputStream os  = client.getOutputStream();
        os.write("tcp连接成功".getBytes());
        InputStream in = client.getInputStream();
        byte[] b  = new byte[100];
        int len = in.read(b);
        System.out.println( new String(b,0,len));
        //关闭资源
         in.close();
         os.close();
         client.close();
    }
}
