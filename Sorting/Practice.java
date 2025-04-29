package Sorting;

public class Practice {
    public static void main(String[] args) {
        
    

   //selection sort 

   int arr[]={3,9,4,1,7,2};

   for(int i =0;i<arr.length;i++){
    int smallest = i;
    for(int j =i+1;j<arr.length;j++){
        if(arr[smallest]> arr[j]){
            smallest = j;
        }
    }
    // if smallest get updated with j means there is a eleemnt smaller than i so swap 
    // so now smallest = j and swap with i
    // and if smallest = arr[i] is the smallest then the swap will be done with smallest of i and arr of i itself so now change will be seen
    int temp = arr[smallest];
    arr[smallest] = arr[i];
    arr[i] = temp;
   }
   for(int i =0;i<arr.length;i++){
    System.out.println(arr[i] +" ");
   }
}
}
