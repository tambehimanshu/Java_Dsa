class DP{
    public static void main(String[] args) { // tc O(N) tc O(1)
        int prices[]= {7,1,5,3,6,4};

        int mini = prices[0];
        int profit =0;
        for(int i =1;i<prices.length;i++){
            int cost = prices[i]- mini;
            profit = Math.max(profit, cost);

            mini = Math.min(mini,prices[i]);
        }
        System.out.println(profit);
    }
}