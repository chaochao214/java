package Com.twc;

public class changebleParameter {
    public static void main(String[] args) {
        int[] arr= {1,4,62,431,2};

    }

    //元素求和
   public static int getSum(int...arr){
        int sum = 0;
        for(int a:arr){
            sum  +=a;
        }
        return sum;
   }
}
