package com.twc.ClassDemo2;

public class Test {
    public static void main(String[] args) {
        //weapon 对象
        Weapon wp   = new Weapon("斧头",1);
        //armour 对象
        Armour ar = new  Armour("布甲",10);

        //创建新角色
        Role  a  = new Role();
        a.setWeapon(wp);
        a.setArmour(ar);

        //角色进行攻击和穿戴护甲
        a.attack();
        a.wear();

    }
}
