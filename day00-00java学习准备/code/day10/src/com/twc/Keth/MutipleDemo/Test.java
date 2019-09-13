package com.twc.Keth.MutipleDemo;

public class Test {
    public static void main(String[] args) {

      //向上转型
        Animal a = new Cat();
        a.eat();
        //向下转型
        if(a instanceof Cat){
            Cat c  = (Cat)a;
            c.eat();


        }else if(a instanceof Dog){
            Dog d = (Dog)a;
            d.eat();
        }


    }

    public static void showCatEat(Cat c) {
        c.eat();
    }

    public static void showDogEat(Dog d) {
        d.eat();
    }

    public static void showAnimalEat(Animal a) {
        a.eat();
    }


}
