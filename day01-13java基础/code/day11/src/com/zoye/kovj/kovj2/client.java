package com.zoye.kovj.kovj2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        //
        Socket s = new Socket("127.0.0.1",9898);
        FileInputStream  fis =  new FileInputStream("day11\\a.txt");
        BufferedOutputStream bos =  new BufferedOutputStream(s.getOutputStream());
        int b = -1;
        while((b=fis.read())!=-1){
            bos.write(b);
        }
        bos.close();
        fis.close();
        s.close();
    }
}
