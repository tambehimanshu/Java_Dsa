package DP.Stock;
//same like the stock_III just change the capacity range to k 
public class Stock_VI {  
   
    public static int recFun(int ind , int transactionNo ,int prices[],int n ,int k){
      if(ind == n || transactionNo == 2*k) return 0;
      if(transactionNo %2 ==0)// buy case
      {
        return Math.max(-prices[ind]+recFun(ind+1, transactionNo+1, prices, n, k), 0+ recFun(ind+1, transactionNo, prices, n, k));
      }
      // sell case
      return Math.max(prices[ind]+recFun(ind+1, transactionNo+1, prices, n, k), 0+ recFun(ind+1, transactionNo, prices, n, k));


    }
    public static int moreOp(int prices[],int k){
        int n = prices.length;

        int [] after = new int[2*k+1]; // buy + transaction therefore 2*k
        int [] curr = new int[2*k+1];
        for(int ind = n-1;ind>=0;ind--){
            for(int tranNo = 2*k-1;tranNo>=0;tranNo--){
                 if(tranNo % 2== 0){
                      curr[tranNo]= Math.max(-prices[ind]+after[tranNo+1], 0+after[tranNo]);
                }
                else curr[tranNo]=Math.max(prices[ind] + after[tranNo+1], 0+after[tranNo]);
              
            }
            after = curr;
        }
        return after[0];
    }

    public static int funTab(int prices[] ,int k ){
        int n = prices.length;
        int dp[][]= new int[n+1][2*k+1];

        for(int ind =n-1;ind>=0;ind--){
            for(int transNo =2*k-1;transNo>=0;transNo--){
                if(transNo % 2== 0){
                      dp[ind][transNo]= Math.max(-prices[ind]+dp[ind+1][transNo+1], 0+dp[ind+1][transNo]);
                }
                else dp[ind][transNo]=Math.max(prices[ind] + dp[ind+1][transNo+1], 0+dp[ind+1][transNo]);
              
            }

        }
        return dp[0][0];
    }
   
    public static void main(String[] args) {
       int prices[]= {3,3,5,0,0,3,2,5};
       int n =prices.length;
       int k =3;
      
      //System.out.println(recFun(0, 0, prices,n, k));
     // System.out.println(funTab(prices, k));
      System.out.println(moreOp(prices, k));
    }
}
