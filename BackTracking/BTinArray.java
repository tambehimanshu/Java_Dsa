package BackTracking;

public class BTinArray {

    public static void array(int arr[],int i ,int val){
        //base xase

        if(i ==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        array(arr, i+1, val+1);
        arr[i]=arr[i]-2; // step of backtracking
    }
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        array(arr, 0 , 1);
        printArr(arr);


    }
}
