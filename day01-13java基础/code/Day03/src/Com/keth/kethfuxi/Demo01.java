package Com.keth.kethfuxi;

public class Demo01 {
    public static void main(String[] args) {

    }
    public static int getSum(int  ... arr){
            int sum  = 0 ;
            for(int i :arr){
                sum+= i;
            }
            return sum;

    }
    public static int getSum(int a,int b){
         return a+b;
    }

}
