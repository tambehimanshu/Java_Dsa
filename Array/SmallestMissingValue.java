public class SmallestMissingValue {
    public static int fiindMissing(int arr[]){
        int n = arr.length;

        for(int i =0;i<n;i++){
            while (arr[i]>=1 && arr[i]<=n && arr[i] != arr[arr[i]-1]) {
                int temp = arr[i];
                arr[i]= arr[arr[i]-1];
                arr[temp -1]  =temp;
                
            }
        }
         for(int i =1;i<=n;i++){
            if(i!= arr[i-1]){
                return i;
            }
         }
         return n+1;
    }
    public static void main(String[] args) {
        int arr[]= {-3,2,1,4,1,7};
        System.out.println(fiindMissing(arr));
    }
}
//tc O(n)
//scO(1)