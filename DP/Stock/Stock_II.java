package DP.Stock;

public class Stock_II {
     public static int maxProfit(int[] prices) {
        int aheadBuy =0, aheadNotBuy=0;

        for(int  i =prices.length-1;i>= 0;i--){
            int currBuy =Math.max(-prices[i]+aheadNotBuy,aheadBuy);
            int currNotBuy = Math.max(prices[i]+aheadBuy,aheadNotBuy);

            aheadBuy = currBuy;
            aheadNotBuy= currNotBuy;
        }
        return aheadBuy;
    }
    public static void main(String[] args) {
        int prices []= {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
    
}
