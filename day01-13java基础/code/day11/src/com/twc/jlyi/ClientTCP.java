package com.twc.jlyi;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端  发送数据");
        // 创建socket (ip ,port) 确定连接的地
        Socket client = new Socket("localhost",6666);
        OutputStream os  =client.getOutputStream();
        //写出数据
        os.write("客户端tcp连接成功".getBytes());
        os.close();
        client.close();
    }
}
