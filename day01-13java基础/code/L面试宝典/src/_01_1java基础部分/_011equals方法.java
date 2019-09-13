package _01_1java基础部分;

public class _011equals方法 {
    public static void main(String[] args) {
        String a = new String("foo");
        String b = new String("foo");


        Object objA  = new Object();
        objA = 3f;
        Object objB  = new Object();
        objB  =3f;
        System.out.println(objA==objB);
        System.out.println(objA.equals(objB));

        System.out.println("_----");
        System.out.println(a.equals(b));
        System.out.println(a==b);
    }
}
