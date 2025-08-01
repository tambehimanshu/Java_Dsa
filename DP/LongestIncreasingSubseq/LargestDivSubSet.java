package DP.LongestIncreasingSubseq;

import java.util.*;

public class LargestDivSubSet { // tcc o(n2) scO(n)
    public static List<Integer> findlarDiv(int arr[]){
        int n =arr.length; 
        if(n == 0) return new ArrayList<>();

        Arrays.sort(arr);
        int dp[]= new int[n];
        Arrays.fill(dp, 1);
        int prev []= new int[n];
        Arrays.fill(prev, -1);

        int maxInd =0;
        for(int i =1;i<n;i++){
            for(int j =0;j<i;j++){
                if(arr[i] %arr[j] ==0 && dp[j]+1>dp[i]){
                    dp[i] =dp[j]+1;
                    prev[i]=j;

                }
            }
            if(dp[i]>dp[maxInd]){
            maxInd = i;
            }
        }
        List<Integer> res = new ArrayList<>();
        while (maxInd !=-1) {
            res.add(arr[maxInd]);
        maxInd = prev[maxInd]; //  update maxind with the prev means take the index of prev[maxind] then go the arr[prev[maxind]]

        }
        Collections.reverse(res);
        return res;
        

    }
    public static void main(String[] args) {
        int arr[] = {1,16,7,4,8};

        
        List<Integer> result = findlarDiv(arr);

        for(int num: result){
            System.out.print(num+" ");
        }
    }
    
}
