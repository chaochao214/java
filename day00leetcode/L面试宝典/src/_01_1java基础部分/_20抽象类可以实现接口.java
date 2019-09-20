package _01_1java基础部分;

import java.io.Serializable;

/**
 *
 * 接口可以继承接口。抽象类可以实现(implements)接口，抽象类可以继承具体类。抽象类中
 * 可以有静态的 main 方法。
 */

//抽象类和实体类的唯一区别，不能创建实例对象和拥有abstract方法
public class _20抽象类可以实现接口 {

}
abstract class testA implements Serializable {
    void meth() {

    }
    //
    abstract  void  method2();


}
