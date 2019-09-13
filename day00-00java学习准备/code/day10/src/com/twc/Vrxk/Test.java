package com.twc.Vrxk;

public class Test {
    public static void main(String[] args) {
        //向上转型
        // 期待输出结果    猫吃
        Animal a = new Cat();
        a.eat();
        //向下转型

        Cat  c  = (Cat)a;
        c.catchaMouse();

        System.out.println("————————————————————");

        Animal a1 = new Cat();
        a1.eat();
     //   Dog d = (Dog) a1;
        //这里会报错： 类型转换异常
        if(a1 instanceof Dog   ){
            ((Dog) a1).wathHouse();
        }else{
            System.out.println("a1 is not instance of a2");
        }



    }
}
