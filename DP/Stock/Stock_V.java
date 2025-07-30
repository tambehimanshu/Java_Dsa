package DP.Stock;
//memo and tabu code same as the prev stock codes

public class Stock_V {

    public static int f(int ind , int buy ,int prices[],int fee,int n){
        if(ind ==n )return 0;

        if(buy ==1){
            return Math.max(-prices[ind] + f(ind+1, 0,prices,fee,n) , 0+f(ind+1, 1, prices,fee,n));
        }
        else{
            return Math.max(prices[ind] - fee + f(ind+1, 1, prices,fee,n), 0+f(ind+1, 0, prices,fee,n));
        }
    }
    public static int funRec(int prices[],int fee){
        int n =prices.length;

        return  f(0,1 , prices ,fee,n);
    }
    
    public static int funOptimized(int prices[] ,int fee){ // tc O(1) sc O(n)
        int n = prices.length;
        int aheadBuy =0, aheadNotBuy =0;
        for(int ind =n-1;ind>=0;ind--){
            int currBuy = Math.max(-prices[ind]+aheadNotBuy,aheadBuy);

            int currNotBuy = Math.max(prices[ind] -fee + aheadBuy, aheadNotBuy);


            aheadBuy = currBuy;
            aheadNotBuy = currNotBuy;
        }
        return aheadBuy;

    }
    
    public static void main(String[] args) {
        int prices[]= {1,2,3,6,1,5};
        int fee =2;

       // System.out.println(funRec(prices,fee));
       System.out.println(funOptimized(prices, fee));

    }
}
