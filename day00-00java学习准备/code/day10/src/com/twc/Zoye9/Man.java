package com.twc.Zoye9;

class Man extends People implements MoveMent {

    public void life() {
        String str = "说话测试";
        speak(str);
        exercise();
    }

    @Override
    public void exercise() {
        System.out.println(this.getName() + "正在锻炼中");
    }

    public void speak(String language) {
        System.out.println("姓名为" + this.getName() + "的" + this.getCountry() + "人在说着" + language);

    }

    //构造器
    public Man(String name, String country) {
        super(name, country);
    }

    public Man() {
    }

}
