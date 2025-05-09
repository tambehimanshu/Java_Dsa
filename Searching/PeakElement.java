public class PeakElement {

    public static int findHighest(int arr[]){ //tc O(logn ) sc O(1)
        int n = arr.length;

        if(n==1){
            return 0;
        }
        if(arr[0]> arr[1]){
            return 0;
        }
        if(arr[n-1] > arr[n-2]){
            return n-1;
        }

        int high =n-2;
        int low = 1;

        while (low<=    high) {
            int mid = low+(high -low)/2;

            if(arr[mid]> arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
 // if mid is smaller then mid +1 then low = mid+1 else high = mid-1
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]= {7,2,3,4,5,8,1};

        System.out.println(findHighest(arr));
    }
    
}
