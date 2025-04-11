
public class ReverseArray {

    public static  void reverse(int arr[]){
        int first =0;
         int last =arr.length-1;

         while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last]=temp;

            first++;
            last--;
            
         }
    }

    public static void rev(int arr[]){
         
        int n = arr.length;
        for(int i =0;i<n/2;i++){
            int temp = arr[i];
            arr[i]= arr[n-1-i];
            arr[n-1-i] = temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        //reverse(arr);

        rev(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}//tc O(n)
//sc O(1)
