package com.twc.Zoye;

public class Person {
    String name;
    int health;

    public Person() {
    }

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0){
            throw new Zoye10("生命值为负异常"+health);
        }
        this.health = health;
    }
}
