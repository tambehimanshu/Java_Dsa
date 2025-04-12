public class ReverseToLeft {

    public static void rev(int arr[],int start ,int end){
        while(start <end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void revleft(int arr[],int d){
        int n = arr.length;
        if(d == 0){
            return ;
        }

        d= d%n;

// 1st rev only for the d chunk ie d =2 means start 2 elements will only swap;
        rev(arr,0,d-1);
        //2nd rev for the remainig elements 
        rev(arr, d, n-1);
        //last for the entire arr
        rev(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int n = arr.length;
        int d = 8;

       revleft(arr, d);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
//tc O(n)

//sc O(1)
