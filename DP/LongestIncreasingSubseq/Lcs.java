package DP.LongestIncreasingSubseq;
import java.util.*;

public class Lcs {
    public static int funRec(int ind , int prev, int arr[],int n){

        if(ind == n) return 0;

        int notTake = 0+ funRec(ind +1, prev, arr, n);

        int take = 0;
        if(prev ==-1 || arr[ind] > arr[prev]){
            take = 1+ funRec(ind+1, ind, arr, n);
        }
        return Math.max(notTake, take);
    }


    // memoization
    public static int funMemo(int ind,int prev ,int dp[][],int arr[], int n){
  
        if(ind == n )return 0;

        if(dp[ind][prev+1] != -1) return dp[ind][prev+1];

        int notTake = funMemo(ind+1, prev , dp, arr, n);
        int take = 0;
        if(prev == -1 || arr[ind] > arr[prev]){
            take =1+ funMemo(ind+1, ind, dp, arr, n);
        }
        return dp[ind][prev+1] = Math.max(notTake, take);
    }

    // tabulation

    public static int funTabu(int arr[]){
        int n = arr.length;
        int dp []= new int[n];
        Arrays.fill(dp, 1);

        int maxi =1;
        for(int ind =0;ind<n;ind++){
            for(int prev = 0;prev<ind;prev++){
          if(arr[ind] > arr[prev]){
            dp[ind]=Math.max(dp[ind],dp[prev]+1);
          }
            }
            maxi = Math.max(maxi,dp[ind]);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[]= {5,4,11,1,16,8};
        int n= arr.length;

        int dp[][]= new int [n][n+1];
          for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }


       // System.out.println("lcs of length : "+funRec(0,-1,arr,n));
       //System.out.println(funMemo(0, -1, dp, arr, n));
       System.out.println(funTabu(arr));
    }
}
