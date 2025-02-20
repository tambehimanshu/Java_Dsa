
import java.util.*;

public class JavaBasic{
    public static void main(String[]args){

        int arr[]={1,2,3,4,5};
        int tsr= 1;
        boolean found = false;

     for (int i=0;i<arr.length;i++){
        if(arr[i]==tsr){
            System.out.println(arr[i]+" target found at index :"+i);
            found = true;
        }
     }
     if(!found){
        System.out.println("Target not Found");
     }

        
    }
}