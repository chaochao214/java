package com.twc.Zoye7;

public class Pencil extends  Pen {
    @Override
    public void write() {
        super.write();
        System.out.println("现在使用的是价格为XXX的YYY颜色的铅笔");
    }

    public Pencil() {
    }

    public Pencil(Float price, String color) {
        super(price, color);
    }

}

