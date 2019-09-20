package _01_1java基础部分;

/**
 *  final关键字修饰变量时，引用类型不能变，还是引用的对象不能变?
 *  引用对象不能变
 *
 */
public class _10final关键字 {
    public static void main(String[] args) {
        final  StringBuffer a  = new StringBuffer("immutable");
        // 是指引用变量不能变，引用变量所指向的对象中的内容是可以改变的
        //a=new StringBuffer("");
        a.append("broken");

    }
    //final定义在方法中并没有效果
    public void method(final  StringBuffer param){
        param.append("a");
    }


}
