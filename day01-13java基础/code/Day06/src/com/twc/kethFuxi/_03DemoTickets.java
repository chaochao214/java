package com.twc.kethFuxi;

public class _03DemoTickets {
    public static void main(String[] args) {

        sellTickets s=  new sellTickets();
        /*sellTickets s2=  new sellTickets();
        sellTickets s3=  new sellTickets();*/
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
    }

}
