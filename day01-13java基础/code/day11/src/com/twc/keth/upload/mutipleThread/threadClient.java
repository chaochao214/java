package com.twc.keth.upload.mutipleThread;

public class threadClient {
    public static void main(String[] args) {
            new ClientThread().start();
            new ClientThread().start();
            new ClientThread().start();
            new ClientThread().start();
            new ClientThread().start();


    }
}
