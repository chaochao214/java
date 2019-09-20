package com.twc;

public class Demo718 {
    public int findLength(int[] a, int[] b) {
        int  n = a.length,m= b.length,res =0;
        int[][] dp  = new int[n+1][m+1];
        for(int i = 0;i< n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    dp[i+1][j+1] = dp[i][j]>0?dp[i][j]+1:1;
                    res=Math.max(res,dp[i+1][j+1]);
                }
            }
        }
        return  res;

    }

}

