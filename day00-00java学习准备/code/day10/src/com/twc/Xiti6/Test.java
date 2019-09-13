package com.twc.Xiti6;

public class Test {
    public static void main(String[] args) {
        /**
         *
         * 父类引用指向子类对象
         */
      //编译不报错，运行报错
        //向下转型容易报错
      /* Animal a  = new Animal();
       Dog  s = (Dog)a;*/


       Animal  a2  = new Dog();
       Dog s2  = (Dog)a2;


       Animal a3  = new Dog();
       Dog s = (Dog)a3;
       s.lookHome();

       /*Animal a4 = new  Animal();
       Student s4 =(Student)a4;*/
    }
}
