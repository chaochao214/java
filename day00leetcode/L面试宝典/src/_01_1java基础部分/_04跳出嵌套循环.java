package _01_1java基础部分;

public class _04跳出嵌套循环 {
    public static void main(String[] args) {


        outer:
        for (int i = 1; i < 10; i++) {
            System.out.println("我被执行了" + i);
            inner:
            for (int j = 0; j < i; j++) {
                System.out.println("我也被执行了" + j);
                //break outer;
                break inner;
            }
        }
    }
}
