package com.twc.keth.upload.mutipleThread;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientThread extends  Thread{
    @Override
    public void run() {
        try {
            Socket s = new Socket("127.0.0.1",8089);
            BufferedInputStream  bis  = new BufferedInputStream(new FileInputStream( "day11\\img.jpg"));
            BufferedOutputStream bos  = new BufferedOutputStream(s.getOutputStream());
            int b=-1;
            while((b=bis.read())!=-1){
                bos.write(b);
            }
           /* Random r = new Random();
            int waitSec = r.nextInt(10);
            Thread.sleep(waitSec*1000);*/

            System.out.println(Thread.currentThread().getName());
            bos.close();
            bis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
