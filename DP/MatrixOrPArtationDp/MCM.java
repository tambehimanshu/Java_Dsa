package DP.MatrixOrPArtationDp;
import java.util.Arrays;

public class MCM {  // matrix chain multioplication

    public static int matrixChainOrder(int[] arr, int i, int j) { //tc O(n^3) sc O(n^2)
        // bc 
        if( i == j) return 0; // only one matrix, no multiplication needed

        int min = Integer.MAX_VALUE;    

        // try all possible splits
        for (int k = i; k < j; k++) {
            int steps = arr[i-1]*arr[k]*arr[j] + matrixChainOrder(arr, i, k) + matrixChainOrder(arr, k + 1, j);
            min = Math.min(min, steps);
        }
        return min;
    }
    public static int matrixChainOrderMemo(int[] arr, int i, int j, int[][] dp) { //tc O(n^3) sc O(n^2)
        // base case
        if (i == j) return 0; // only one matrix, no multiplication needed

        if (dp[i][j] != -1) return dp[i][j]; 

        int min = Integer.MAX_VALUE;    

        // try all possible splits
        for (int k = i; k < j; k++) {
            int steps = arr[i-1] * arr[k] * arr[j] + matrixChainOrderMemo(arr, i, k, dp) + matrixChainOrderMemo(arr, k + 1, j, dp);
           
            min = Math.min(min, steps);
        }
        return dp[i][j] = min; // store the result in dp array
            
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int row[]: dp) {
            Arrays.fill(row, -1);
        }
       // System.out.println("Minimum number of multiplications is: " + matrixChainOrder(arr, 1, arr.length - 1));

        System.out.println("multiplications with memoization is: " + matrixChainOrderMemo(arr, 1, arr.length - 1, dp));
    }
    
}
