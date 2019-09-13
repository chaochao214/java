package com.twc.Dotd;

public class KeyBoard implements Usb {
    @Override
    public void open() {
        System.out.println("键盘开启，绿灯亮");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭，绿灯熄灭");
    }
    public void type(){

        System.out.println("键盘打字");
    }
}
