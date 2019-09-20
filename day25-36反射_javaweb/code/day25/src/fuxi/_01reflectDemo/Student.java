package fuxi._01reflectDemo;

/**
 * 包名:com.itheima.reflect
 * 作者:Leevi
 * 日期2018-12-08  15:09
 */
public class Student {
    private int age = 198;
    public String name = "张三丰";
    public String address = "深圳";

    public Student() {

    }

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public Student(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void say() {
        System.out.println("hello world...");
    }

    public void say(String str) {
        System.out.println("hello " + str);
    }

    private void study() {
        System.out.println("study hard.....");
    }
}
