package _01_1java基础部分;

public class _12静态变量和实例变量 {
    /**
     * 静态变量和实例变量的区别
     * 静态变量前面要加static 关键字 ，实例变量前不加
     */
    public static void main(String[] args) {
        //静态变量的输出值为什么是1？
    variantTest vt = new variantTest();
    variantTest vt2 = new variantTest();
    variantTest vt3 = new variantTest();

    }

}

class variantTest {
    public static int staticVar =  0;
    public  int instanceVar = 0;
    public variantTest() {
        staticVar++;
        instanceVar++;
        System.out.println("staticVar的值是"+staticVar);
        System.out.println("instanceVar的值是"+instanceVar);

    }
}
