package _01_1java基础部分;

public class _13static方法调用 {
/**
 * 非静态方法可以调用静态方法
 * 静态方法无法调用非静态方法
 *
  */


    public static void main(String[] args) {

    }
    static void testA(){
      //  testB();
        System.out.println("a");
    }
    void testB(){
        System.out.println("b");
    }
    void testC(){
        testA();
        System.out.println("c");
    }


}

