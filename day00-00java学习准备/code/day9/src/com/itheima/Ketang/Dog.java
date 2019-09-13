package com.itheima.Ketang;
/*

这是一个狗类

 */
public class Dog {
    // 属性
  private  String kind;
  private  String color;

    public Dog() {

    }

    public Dog(String kind, String color) {
        this.kind = kind;
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void  eat(){

        System.out.println("狗吃");
    }
    public void  sleep(){
        System.out.println("睡觉");
    }




}

