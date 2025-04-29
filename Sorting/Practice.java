package Sorting;

public class Practice {
    public static void main(String[] args) {
        
        //insertion sort (where we make to bunch of sorted and unsorted)
        int arr[] = {9,2,4,1,6,8};

        for(int i =1;i<arr.length;i++){
            int current = i;
            int j =i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1]= arr[j];
                j--;

            }
            arr[j+1] = current;
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
}
}
