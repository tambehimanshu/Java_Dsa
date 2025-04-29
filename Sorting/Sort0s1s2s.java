package Sorting;

public class Sort0s1s2s {
    public static void sortArr(int []arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]= arr[mid];
                arr[mid] = temp;
                low ++;
                mid++;
            }
            else if(arr[mid]==1){
                mid+=1;
            }
            else{
                int temp =arr[mid];
                arr[mid]= arr[high];
                arr[high]= temp;
                high-=1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,2,1,2,1,0};

        sortArr(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
//tc O(n)
//sc O(1)