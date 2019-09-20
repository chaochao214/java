package _01_2java基础20_40;

public class _37下面这个语句创建几个对象 {
    public static void main(String[] args) {
        /**
         *第一条语句打印的结果为 false，第二条语句打印的结果为 true，这说明 javac 编译可以对
         * 字符串常量直接相加的表达式进行优化，不必要等到运行期去进行加法运算处理，而是在编
         * 译时去掉其中的加号，直接将其编译成一个这些常量相连的结果。
         * 题目中的第一行代码被编译器在编译时优化后，相当于直接定义了一个”abcd”的字符串，
         * 所以，上面的代码应该只创建了一个 String 对象。写如下两行代码
         *
         */
        String s1 = "a";
        String s2 = s1 + "b";
        String s3 = "a" + "b";
        System.out.println(s2 == "ab");
        System.out.println(s3 == "ab");
    }


}
