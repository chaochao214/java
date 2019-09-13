package com.twc.keth.toStringDemo;

public class keth extends Fu {
// 选中之后查看父类的继承体系，Ctrl+h/ctrl+q
/**
 *  1. toString()  方法
 *   public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *     //getClass().getName() 获取全路径名称。
 *    “@”  Integer.toHexString 静态方法 。
 *      this.hashCode() 本类中方法
 *      public native int hashCode();
 *     native 调用底层C代码。
 *   hashCode() : 获取对象的hashCode值，这个值是根据地址值打印的
 *
 *  2. equals()  方法
 *   查看源代码 Ctrl+n
 *   查看类中方法 ctrl f12
  */
public static void main(String[] args) {
    Person  p1  = new Person("张三",13);
    Person  p2  = new Person("李四",14);
    // 打印toString 方法没有多大的用处。 想看到的是属性值而不是地址值
    // 一般会重写toSting方法。
    // 需要打印的是属性值
    System.out.println(p1.toString());
    int arr[]  = new  int[3];
    System.out.println( arr);
}


/**
 * 2。 equals和 obj方法都没有意义，所以要重写
 */
}
