import java.util.Arrays;

public class Stock_III {
    public static int funRec(int ind , int buy , int cap ,int prices[],int n ){ // recursive code tc (exponential) sc (n*m)
        if(ind ==n || cap ==0) return 0;
        if(buy ==1){
            return Math.max(-prices[ind]+ funRec(ind+1, 0, cap, prices, n), 0+funRec(ind+1, 1, cap, prices, n));
        }
         return Math.max(prices[ind]+ funRec(ind+1, 1, cap-1, prices, n), 0+funRec(ind+1, 0, cap, prices, n));
    }
    public static int funMemo(int ind,int buy,int cap,int prices[],int [][][]dp){
        if(ind == prices.length || cap ==0) return 0;
        if(dp[ind][buy][cap] != -1) return dp[ind][buy][cap];

        if(buy ==1){
            dp[ind][buy][cap]= Math.max(-prices[ind] + funMemo(ind+1, 0, cap, prices, dp) , 0+ funMemo(ind+1, 1, cap, prices, dp));
        }
        else{
              dp[ind][buy][cap]= Math.max(prices[ind] + funMemo(ind+1, 1, cap-1, prices, dp) , 0+ funMemo(ind+1, 0, cap, prices, dp));
        }
        return dp[ind][buy][cap];
    }

    public static int funcTab(int prices[]){ //tc O(n*2*3) scO(1)
        int n = prices.length;

        int dp[][][]= new int[n+1][2][3];

        for(int ind = n-1;ind>=0;ind--){
            for(int buy = 0;buy<= 1;buy++ ){
                for(int cap =1;cap<=2;cap++){
                    if(buy ==1){
            dp[ind][buy][cap]= Math.max(-prices[ind] + dp[ind+1][0][cap], 0+ dp[ind+1][1][cap]);
        }
        else{
              dp[ind][buy][cap]= Math.max(prices[ind] + dp[ind+1][1][cap-1] , 0+dp[ind+1][0][cap] );
        }
        
               
    }
           
}
       
}

        return dp[0][1][2];
    }
     public static int funcSpaceO(int prices[]){
        int n = prices.length;

        int after[][]= new int[2][3]; // dp[ind+1]
        int curr[][] = new int [2][3]; // dp[ind]

        for(int ind = n-1;ind>=0;ind--){
            for(int buy = 0;buy<= 1;buy++ ){
                for(int cap =1;cap<=2;cap++){
                    if(buy ==1){
            curr[buy][cap]= Math.max(-prices[ind] + after[0][cap], 0+ after[1][cap]);
        }
        else{
              curr[buy][cap]= Math.max(prices[ind] + after[1][cap-1] , 0+after[0][cap] );
        }
                }
            }
            after = curr;
        }

        return after[1][2];
    }

    public static void main(String[] args) {
        int prices[]= {3,3,5,0,0,3,1,5};
        int n = prices.length;
        
        int dp [][][] = new int [n][2][3];
        for(int [][]arr:dp){
            for(int [] row:arr){
                Arrays.fill(row, -1);
            }
        }
        System.out.println(funcSpaceO(prices));
       // System.out.println(funcTab(prices));
        //System.out.println(funMemo(0,1,2,prices,dp));
      //  System.out.println(funRec(0,1,2,prices,n));
    }
}
