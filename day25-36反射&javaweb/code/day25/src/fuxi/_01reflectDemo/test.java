package fuxi._01reflectDemo;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: twc
 * @Date 2019/5/2 17:14
 **/
public class test {
    //获取字节码对象的三种方式
    //1. 使用类名.class
    @Test
    public  void  test01(){
        Class<Student> studentClass = Student.class;
        //2. 全路径限定名字
        //  Class.forName()
         //3. 对象名  .getClass
         Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
         // 实体类获取类的字节码对象文字
    }
    //使用反射创建对象
    @Test
    public  void test02() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //1.使用字节码对象创建文件
        Class<?> clazz = Student.class;
       /* Object obj = clazz.newInstance();
        System.out.println(obj);*/
        //2.通过反射创建对象
        Constructor<?> constructor = clazz.getConstructor(String.class);
        Object obj2 = constructor.newInstance("深圳宝安");
        System.out.println(obj2);
    }

}
