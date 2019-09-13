package com.twc.Dotd;

public class Laptop  {
    public void run(){

        System.out.println("笔记本运行");

    }
    //笔记本使用usb功能，这时笔记本对象调用这个功能时，必须传递一个符合Usb 规则的Usb 设备
 //为什么把这里叫多态
    public void useUSB(Usb usb){
     if(usb != null){
        usb.open();
        if(usb instanceof Mouse){
            Mouse m  = (Mouse) usb;
            m.click();

        }else if(usb instanceof  KeyBoard){
            KeyBoard kb  = (KeyBoard)usb;
            kb.type();
        }
        usb.close();
     }
    }
    public void shutDown(){
        System.out.println("笔记本关闭");
    }
}
