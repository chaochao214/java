package _02算法与编程._08递归算法题;

public class demo01 {
    /**
     * 一个整数，大于0，不用循环和本地变量，按照 n，2n，4n，8n 的顺序递增，当值大于5000
     * 时，把值按照指定顺序输出来。
     * 例：n=1237
     * 则输出为：
     * 1237，
     * 2474，
     * 4948，
     * 9896，
     * 9896，
     * 4948，
     * 2474，
     * 1237，
     */
    public static void main(String[] args) {
        System.out.println(doubleNum(1024));

    }

    public static int doubleNum(int num) {
        if (num <= 5000)
        num=doubleNum(num * 2);
        return num;
    }
}
