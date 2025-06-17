package DP;

public class BestTimeForStockBuySell { //tc O(n) sc O(1)
    public static int findBestTime(int arr[]){

        int buy = arr[0];
        int profit=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<buy){
                buy = arr[i];
            }
            else if(arr[i]-buy > profit){
                profit = arr[i]-buy;

            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,5,6,0};

        System.out.println(findBestTime(arr));
    }
}
