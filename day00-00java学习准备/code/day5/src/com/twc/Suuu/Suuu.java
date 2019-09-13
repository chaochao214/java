package com.twc.Suuu;

public class Suuu {
    public static void main(String[] args) {
        /*for(int i= 1 ;i<101; i++){
            for(int j=2;j< i;j++){
                if(i%j==0 && i!=j){   // 6/2 =0  6！= 2
                    //System.out.print("一");
                    break;
                }
                else if(i%j==0 && i ==j){
                    System.out.print("一");
                    System.out.print(i + "  ");
                          // 6/6
                }
                break;
            }

        }*/
        //System.out.println(isPrime2(13));

        test01(10);
        test01(11);
        test01(12);
        test01(13);

    }
// 缺少 return 的类型。  return放在for里面报错。
    public static boolean isPrime(int a){
        int count = 0;
        for(int i = 1;i <=a; i ++){
            if( a/i ==0 && a!=i ){   //  6/2 ==0而且 6不等2 ，直接跳出循环
                count=0;
            }else if( a/i ==0 && a == i){

                System.out.println(i+"素数判断被执行");
                count=1;
            }else {
                count = 0;
            }
        }
        if (count==1){

            return true;
        }else{
            return false;
        }
    }


    //总是输出false
    public static boolean isPrime2(int a ){
        boolean b =false;
        for(int i =1 ;i<=a ;i++){
            if(a%i==0 && a==i){
                b = true;
            }

        }
        return b;
    }

    public static void test01(int a ){
       for(int i =2 ;i <  a; i++){
            if(a%i==0){
                break;
            }                         //   9
            if(a%i!=0){              //   2 3 4 5 6 7 8
                System.out.println(a + "是素数");
                break;
            }
        }
    }

  /*  public static void Suuu03(){
            if(i%j ==0) break;
            if(j<i) continue;
            else
            System.out.println(i);

    }
*/




}
