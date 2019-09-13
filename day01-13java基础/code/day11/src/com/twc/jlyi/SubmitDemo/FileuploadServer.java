package com.twc.jlyi.SubmitDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileuploadServer {
    public static void main(String[] args) throws IOException {
        System.out.println( "服务器启动");
        //创建服务器端ServerSocket
        ServerSocket serverSocket  = new ServerSocket(6666);
        //建立连接
        Socket accept = serverSocket.accept();
        //创建流对象
        //获取输入流，读取文件数据
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        //
        BufferedOutputStream bos;
        bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
        //读写数据
        byte[]  b = new byte[1024*8];
        int len;
        while((len = bis.read(b))!= -1){
            bos.write(b,0,len);
        }
        bos.close();
        bis.close();
        accept.close();
        System.out.println( "文件上传已保存");
    }



}
