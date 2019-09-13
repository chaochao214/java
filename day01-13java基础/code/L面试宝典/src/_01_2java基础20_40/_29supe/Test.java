package _01_2java基础20_40._29supe;

import java.util.Date;

/**
 *  返回值是 test而不是date ;
 * public final Class<?> getClass​()
 *  getClass是final类型的，所以说不可以通过super来覆盖
 *
 */
public class Test extends Date {
    public static void main(String[] args) {
        new Test().test();
    }
    public  void test(){
        System.out.println(super.getClass().getName());
    }
}
