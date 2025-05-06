package Searching;

public class NumberOfOccurrence {  // tc O(log n) sc O(1)
    public static int upperBound(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        int res = arr.length;

        while(low <= high){
            int mid = low +(high-low);

            if(arr[mid]> target){
                res = mid;
                high = mid-1;
            }
            else{
                low  = mid+1;
            }
        }
        return res;
    }
    public static int lowerBound(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        int res = arr.length;

        while(low <= high){
            int mid = low +(high-low);

            if(arr[mid]>=target){
                res = mid;
                high = mid-1;
            }
            else{
                low  = mid+1;
            }
        }
        return res;
    }
    public static int findOccurrence(int arr[],int target){
        return upperBound(arr,target) - lowerBound(arr,target);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,2,2,2,3,4};
        int target = 2;

       System.out.println(findOccurrence(arr, target));
    }
    
}
