public class BinarySearch{
    public static int binarySearch(int arr[], int key){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
            
            
        }
        return -1;
        
    }
    public static void main(String[]args){
        int arr []={1,3,5,6,8,9,11,14};

        int key = 8;

        int result = binarySearch(arr,key);

        if(result == -1) {
            System.out.println("Element is not present in array");
        }else {
            System.out.println("Element is present at index " + result);
        }
    }
    

}