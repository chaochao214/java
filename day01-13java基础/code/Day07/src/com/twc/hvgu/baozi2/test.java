package com.twc.hvgu.baozi2;

public class test {
    public static void main(String[] args) {
        baozi bz= new baozi();
        producer pr = new producer(bz);
        Cunsumer cu = new Cunsumer(bz);
        pr.start();
        cu.start();
    }
}
