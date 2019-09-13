package Com.zoye;

import java.util.HashSet;

public class Zoye6 {

    public static void main(String[] args) {
        //创建HashSet用于存储Person类型
        HashSet<Person> hashPerson  = new HashSet<Person>();
        hashPerson.add(new Person("twc",1));
        hashPerson.add(new Person("21",1));
        hashPerson.add(new Person("22", 32));

        for(Person p: hashPerson){
            System.out.println(p);
        }

    }
}
