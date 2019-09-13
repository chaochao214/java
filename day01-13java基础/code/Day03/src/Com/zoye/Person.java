package Com.zoye;

import java.util.Objects;

public class Person {
    private  String  name;
    private  int age;
    public Person(){}
    public Person(String name,int age){
        this.name= name;
        this.age = age;

    }
//重写了 equals和hashcode方法，看不懂


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean  equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
}

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
