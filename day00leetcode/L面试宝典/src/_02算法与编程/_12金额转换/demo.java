package _02算法与编程._12金额转换;

public class demo {
    public static void main(String[] args) {
        convert(10);
    }

    static void convert(int num) {
        int count = 0;
        String a = "";
        while (num != 0) {
            int i = num / 10;
            a = hanCha(count) + a;
            num = num / 10;
        }
        System.out.println(a);
    }

    private static String hanCha(int count) {
        switch (count) {
            case 0:
                return "元";
            case 1:
                return "拾";
            case 2:
                return "佰";
            case 3:
                return "千";
            default:
                return "";
        }

    }
}
