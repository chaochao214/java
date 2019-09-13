package com.twc.Zoye11;

public class Dog  extends  Animal implements Sports{

    void speak(String str){
        System.out.println(this.getName() + "说" + str);

    }

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(this.getName() + "在狗刨中！");
    }
    void goPlay(){
        String s = "梆硬";
        speak(s);
        swimming();
    }
}
