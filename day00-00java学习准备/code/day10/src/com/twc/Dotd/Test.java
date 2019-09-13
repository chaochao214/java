package com.twc.Dotd;

public class Test {
    public static void main(String[] args) {
        Laptop  lt  = new Laptop();
        // 笔记本开启
        lt.run();
        // 创建鼠标实体对象
        Usb u  = new Mouse();
        //笔记本使用鼠标
        lt.useUSB(u);

        //创建键盘实体对象
        KeyBoard kb  =new KeyBoard();
        //笔记本使用键盘
        lt.useUSB(kb);
        //笔记本关闭
        lt.shutDown();
    }
}
