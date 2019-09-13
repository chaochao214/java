package com.zoye.kovj.kovj3;

import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("127.0.0.1",8484);
        BufferedOutputStream bos= new BufferedOutputStream(sc.getOutputStream());
        File file = new File("day11\\sstu.jpg");
        if(!file.getName().endsWith(".jpg")){
            System.out.println("文件格式不正确");
            return;
        }
        BufferedInputStream  bis = new BufferedInputStream(new FileInputStream(file));
        int len =-1;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        System.out.println("上传成功");
        bis.close();
        bos.close();
        sc.close();
    }
}
