package com.twc.Zoye7;

public class Test {
    public static void main(String[] args) {
        Brush b1   = new Brush();
        b1.setPrice(5.8F);
        b1.setColor("黑色");

        Pencil p1  = new Pencil();
        p1.setColor("红色");
        p1.setPrice(2.5F);

        Painter pt = new Painter();
        pt.setName("王流秋");
        pt.draw(b1);
        pt.draw(p1);
    }
}
