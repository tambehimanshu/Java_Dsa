package Sorting;

class InsertionSort {

    public static void  main(String[]args){
        int arr[]={2,4,8,1,6,3};

        for(int i=1;i<arr.length;i++){
            int curr = arr[i];

            int j = i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}