public class CeilingOfSortedArray {
    public static int findx(int arr[] ,int x){ // tc O(log n ) sc O(1)
        int high = arr.length-1 , low = 0 ,res =-1;

    while(low <= high){
        int mid = low+(high-low)/2;

        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]< x){
        
            low = mid+1;
        }
        else{
            res = mid;
            high = mid-1;
        }
    }
    return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,8,10,10,12,19};
        int x = 5;

        //need to find the smallest element from arr[] which is >=x
        System.out.println(findx(arr,x));
    }
}
