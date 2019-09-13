package com.twc.Zoye7;

import java.util.Random;

public class zoye {
    public static void main(String[] args) {
    int[]  a = {1,2,3};
    int[]  b = {1,5,6};
        //System.out.println( zoye3(a));
        /*int[] c = zoye3(a);
        for(int i=0 ;i< c.length;i++){
            System.out.println(c[i]);
        }*/
       // zoye9();
         int[]  c = new int[5];
         Random r = new Random();
         for(int i=0;i<c.length;i++){
             c[i]= r.nextInt(19);
         }
        for(int i =1 ;i<c.length;i++){
            System.out.println(c[i]);
        }
        System.out.println("--------------");
         getNewArray(c);
         for(int i =1 ;i<c.length;i++){
             System.out.println(c[i]);
         }
     }

   public static boolean zoye1(int a[]  ,int b[] ) {
        if(a[0]==b[0] || a[a.length-1] ==b[b.length-1]){
            return true;
        }else{
            return false;
        }
   }
   public static boolean zoye2(int a[]){
        if(a[0]==6 || a[a.length-1]==6){
            return true;
        }else{
            return false;
        }

   }
   public static int[]  zoye3(int[] a){

        for(int i =0;i<a.length;i++){
            if(a[i] ==2 && a[i+1]==3){
                a[i+1] =0;
            }
        }
        return a ;
   }
   public static boolean zoye4(int[] a){
        return true;
   }
   public static int[] zoye6(int[] a ){
        if(a.length<=2){
            return a;
        }else{
            int[] b ={a[0],a[1]};
            return b;
            }

        }

    public static boolean zoye7(int[] a){
        for(int i =1 ;i< a.length;i ++){
            if (a[i]==2 && a[i]==3) {
            return  true;

            }
        }
        return false;
    }
    public static boolean zoye8(int[] a){
        for(int i= 1; i<a.length;i++){
            if(a[i] ==2&&a[i]==3){
                return false;
            }

        }
        return true;

    }
    public static void zoye9(){
        int a[]  = {6,2,9,15,1,5,20,7,18};
        int temp = 0;
        int num=0;
        for(int i=0;i<a.length;i++){
            if(temp< a[i]){
                temp= a[i];
                num = i;
            }
        }
        a[num]=a[a.length-1];
        a[a.length-1]=temp;

        for(int i=0;i<a.length;i++){
            if(temp> a[i]){
                temp= a[i];
                num = i;
            }
        }
        a[num]=a[0];
        a[0]=temp;
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }

    }
    public static int[] getNewArray(int[] arr){
        for(int i =1 ;i< arr.length;i++){
            if(arr[i]<10){
                arr[i]=0;
            }
        }
        return arr;
    }



   }

