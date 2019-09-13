package com.twc.keth;

import java.io.Serializable;

public class RoleHero implements Serializable {
    private String name;
    private String weapon;
    private String damage;

    public RoleHero() {
    }

    public RoleHero(String name, String weapon, String damage) {
        this.name = name;
        this.weapon = weapon;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "RoleHero{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", damage='" + damage + '\'' +
                '}';
    }
}
