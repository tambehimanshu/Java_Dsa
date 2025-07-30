package DP.Stock;

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
    public static void main(String[] args) {
        int prices[]= {1,2,3,6,1,4};
        int fee =2;

        System.out.println(funRec(prices,fee));
    }
}
