package Com.jlyi;

public class 可变参数 {
    public static void main(String[] args) {
         int[] arr = {1,4,22,10};

            getSum(1,2,3,5,6);
    }
    //可变参数。
        public static int getSum(int...arr){
        int sum =0;
         for(int a:arr){
             sum+=a;

         }
         return  sum;
        }
}
