package Sorting;

public class BubbleSort { 
    public static void main(String[]args){
        int arr[] = {2,1,3,9,4,8,5};

        for (int i=0;i<arr.length-1;i++){
            boolean swapped =false; //optimized way
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped =true;
                }
            }
            if(swapped ==false){
                break;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
// O(n) for best case
//O(n^2)for worst case.
