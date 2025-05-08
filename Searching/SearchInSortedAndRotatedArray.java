package Searching;

public class SearchInSortedAndRotatedArray { //tc O(logn) sc O(1)
 
    public static int searchInRotated(int arr[],int key){
        int high = arr.length-1;
        int low = 0;

        
        while (low<= high) {
            int mid = low+(high-low)/2;

// base case

            if(arr[mid] == key){
                return mid;

            }

            //case 1 if left part is sorted

            if(arr[mid]>= low){

                //if key in left part of sorted array 
                if(key<arr[mid] && key >= arr[low]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }else{
                //case 2 if right is dorted 
                if(key <= arr[high] && key > arr[mid]){
                    low =mid+1;
                }
                else{
                    high = mid-1;
                }
            }

            
            
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[]= {4,5,6,7,8,9,0,1,2,3};
        int key = 3;
        System.out.println(searchInRotated(arr, key));
    }
    
   


}
