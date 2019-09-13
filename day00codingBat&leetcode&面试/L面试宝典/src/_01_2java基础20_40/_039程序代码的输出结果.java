package _01_2java基础20_40;

public class _039程序代码的输出结果 {


}
class smallT{
    public static void main(String[] args) {
        smallT t = new smallT();
        int b =  t.get();
        System.out.println(b);
    }

    private int get() {
        try{
            return 1;
        }
        finally {
            return  2;
        }
    }
    /**
     *  return语句执行后不立即返回,然后执行finally
     *
     */
}