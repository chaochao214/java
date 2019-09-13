package com.twc.Zoye7;

public class Brush  extends Pen{
    @Override
    public void write() {
        super.write();
        System.out.println("现在使用的是价格为XXX的YYY颜色的画笔");
    }

    public Brush() {
    }

    public Brush(Float price, String color) {
        super(price, color);
    }
}
