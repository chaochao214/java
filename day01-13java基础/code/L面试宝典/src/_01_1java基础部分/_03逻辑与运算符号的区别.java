package _01_1java基础部分;

/**
 *说说&和&&的区别
 * 1.都可以作为是 逻辑与  判断符号来使用
 * && 有短路功能，提高效率
 * &&前面为false，后面的内容不再执行
 */
public class _03逻辑与运算符号的区别 {
   /* public static void main(String[] args) {
        //System.out.println(true&false);
        System.out.println(testA() && testB());
    }
    static boolean testA(){
        System.out.println("a被执行了");
        return false;
    }
    static boolean testB(){
        System.out.println("b被执行了");
        return true;
    }*/
   public static void main(String[] args) {
       System.out.println(testB()&&testA());

       System.out.println(testA()&&testB());
       System.out.println(testA()&&testA());
       System.out.println(testB()&&testB());


     /*  System.out.println(false&&true);
       System.out.println(true&&false);
       System.out.println(true&&true);
       System.out.println(false&&false);*/
       //


   }
   static boolean testA(){
       System.out.println("a被执行");
       return  true;
   }
    static boolean testB(){
        System.out.println("b被执行");
        return  false;
    }


}
