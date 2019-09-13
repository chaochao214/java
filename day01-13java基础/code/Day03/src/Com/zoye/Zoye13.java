package Com.zoye;

import java.util.Arrays;

public class Zoye13 {
    public static void main(String[] args) {
        Student s1 = new Student("name1",1,1);
        Student s2 = new Student("name2",2,2);
        Student s3 = new Student("name3",3,3);
        Student stu[] ={s1,s2,s3};


        System.out.println("Zoye1");
        // ?? sort方法是 Arrays的方法，为什么要重写 comparable接口的方法？
        Arrays.sort(stu);
        for (Student  s : stu) {
            System.out.println(s);
        }



    }

}
