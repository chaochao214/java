package com.twc.Zoye7;

public class Pen  implements writeAction{

    @Override
    public void write() {

    }
    private  Float Price;
    private  String color;

    public Pen() {
    }

    public Pen(Float price, String color) {
        Price = price;
        this.color = color;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
