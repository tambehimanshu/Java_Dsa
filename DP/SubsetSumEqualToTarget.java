package DP;

public class SubsetSumEqualToTarget {
    public static boolean subsetRecHelper( int arr[],int idx , int k ){
        if(k==0) return true;
        if(idx ==0) return arr[0] == k;
       
          boolean notpick = subsetRecHelper(arr, idx-1, k);
        boolean pick = false;
        if(k >= arr[idx]){
            pick = subsetRecHelper(arr, idx-1, k-arr[idx]);
        }
      

      return pick || notpick;
    }
    public static  boolean subsetRec(int arr[],int k){
        int n = arr.length;
        return subsetRecHelper(arr,n-1, k);
    }
 public static void main(String[] args) {
      int arr[]={2,6,4};
      int k =3;
      System.out.println(subsetRec(arr,k));
 }
    

    
}
