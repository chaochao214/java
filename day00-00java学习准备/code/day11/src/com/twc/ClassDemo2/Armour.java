package com.twc.ClassDemo2;

public class Armour {
    String name;  //装备名称
    int protect;  // 防御值

    public Armour(){};

    public Armour(String name,int protect){
        this.name = name;
        this.protect= protect;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
