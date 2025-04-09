import java.util.Arrays;

public class SecondLar {

    public static int sec(int arr[]){
        int n = arr.length;
        if(arr == null || arr.length < 2){
            return -1;
        }
        Arrays.sort(arr);
   
        int largest = -1 ;
        int secondlar = -1;
    
        for(int i =0 ;i <n ;i++){
            if(arr[i]>largest){
                secondlar = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlar && arr[i]< largest){
                secondlar = arr[i];
            }
        }
        return secondlar;
    }
public static void main(String[] args) {
    int arr []= {1,20,3,20,30,40,40};

   
  System.out.println(sec(arr));


}
    
}
//tc O(n)
//sc O(1)