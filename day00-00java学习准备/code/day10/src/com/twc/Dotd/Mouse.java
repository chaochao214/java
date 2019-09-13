package com.twc.Dotd;

public class Mouse  implements  Usb{
    @Override
    public void open() {
        System.out.println("鼠标开启，红灯闪亮");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭，红灯熄灭");

    }
    public void click(){

        System.out.println("鼠标点击");
    }



}
