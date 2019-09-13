package com.twc.Zoye7;

/*
定义方法，接收的参数是一个键盘录入的小数,实现保留小数点后的两位小数(只舍不进) 如：输入5.6789 输出5.67,输入5.67389 输出5.67

 */
public class Zoye5 {

public double test(double a){
    int b = (int)(a*100);
    return ( (double)b)/100;
}
}
