package _02算法与编程._09递归算法题02;

/**
 * 第1个人10，第2个比第1个人大2岁，依次递推，请用递归方式计算出第8个人多大？
 */
public class demo {

    public static void main(String[] args) {
        System.out.println(testA(8));
    }

    static int testA(int n) {
        if (n == 1) {
            return 10;
        }
        return testA(n-1)+2;
    }


}
