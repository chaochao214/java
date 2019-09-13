package com.twc.keth.demo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class clientTest {
    public static void main(String[] args) throws IOException {

        Socket client  = new Socket("127.108.70.70",8080);
        OutputStream  os  = client.getOutputStream();
        int b =-1;

        os.write("day11\timg.jpg".getBytes());

        os.close();

    }
}
