package DP;

public class Fibonacci { // optimized way of fibonacci tc O(n) sc O(1)
    public static int findF(int n){
        int prev =1; // n-1
        int prev2 =0; // n-2
        

        for (int i =2;i<=n;i++){
         int curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        return prev;
        
    }
    public static void main(String[] args) {
        int n =6;

        System.out.println(findF(n));
    }
    
}
