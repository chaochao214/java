package com.twc.Zoye7;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    ;

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    ;

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
