import java.util.Arrays;
import java.util.HashSet;

public class PairWithGivenDifference { // tc O(nlogn) sc O(1)
    public static boolean findxwithTwoPointer(int arr[],int k){
        Arrays.sort(arr);
        int n = arr.length;
        int j = 1;
        for(int i = 0;i<arr.length;i++){
            while(j<n && arr[j]-arr[i]<k){
                j++;
            }
            if(j<n && i !=j && arr[j]- arr[i]== k ){
                return true;
            }
         }
         return false;
    }

    public static boolean findxWithHashSet(int arr[],int k){ // tc O(n) sc O(n)
        Arrays.sort(arr);

        HashSet<Integer> st = new HashSet<>();

        for(int num :arr){
            if(st.contains(num -k)|| st.contains(num+k)){
                return true;
            }
            st.add(num);

        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={5,20,3,2,50,80};
        int x = 78;

        System.out.println(findxwithTwoPointer(arr,x));
        System.out.println(findxWithHashSet(arr, x) );
    }
}
