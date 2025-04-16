public class StockSellAndBuyWithLimit { // tc O(n) sc O(1)
    public static int stockbuysell(int prices[]){
        int overallMin = prices[0];
        int max=0;

        for(int i =1;i<prices.length;i++){
            overallMin = Math.min(prices[i], overallMin);

            max = Math.max(max, prices[i]-overallMin);
        }
        return max;
    }
    public static void main(String[] args) {
        int prices []={7,10,1,3,5,6,9};
        System.out.println(stockbuysell(prices));
    }
}
