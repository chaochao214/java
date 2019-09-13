package Com.zoye;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private float score;

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student o) {

        if (this.score > o.score) {
            return -1;
        } else if (this.score < o.score) {
            return 1;
        } else {
            if (this.age > o.age) {
                return 1;
            } else if (this.age < o.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
