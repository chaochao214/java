package com.twc.test;

import java.util.Objects;

public class Personp {
    private String name;
    private int age;
// 重写Object 类toString 方法
    @Override
    public String toString() {
        return "Personp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        //如果对象地址一样，则认为相同
        if(this== obj){
            return true;
        }
        //如果参数为空，或者类型信息不一样，则认为不同
        if(obj == null || getClass()!= obj.getClass())
            return false;

        //转换为当前类型
        Personp  p =  (Personp) obj;
        //要求基本类型相等，并且将引用类型交给java.util.objects类的equal静态方法方法取出结果
        return age == p.age && Objects.equals(name,p.name);
    }
}
