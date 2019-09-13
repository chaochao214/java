package com.twc.ClassDemo2;

public class Weapon {
    //武器名称，伤害值
      String  name;
      int hurt;
    public Weapon(){};
    public Weapon(String name,int hurt){
        this.name = name;
        this.hurt= hurt;
    };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
