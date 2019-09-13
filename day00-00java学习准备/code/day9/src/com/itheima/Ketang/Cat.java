package com.itheima.Ketang;

public class Cat {
    private String kind;
    private String  color;

    public Cat() {
    }

    public Cat(String kind, String color) {
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
    public void eat(){

        System.out.println("猫吃");
    }
    public void sleep(){
        System.out.println("猫睡");
    }
}
