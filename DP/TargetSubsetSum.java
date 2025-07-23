public class TargetSubsetSum {
    public static boolean isSubset(int arr[],int target,int n ){
        if(n == 0 ) return false;
        if(target == 0) return true;

        if(arr[n-1] <= target){
            return isSubset(arr, target-arr[n-1], n-1)|| isSubset(arr, target, n-1);
        }
        return isSubset(arr, target, n-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int target = 5;
        int n = arr.length;

        System.out.println(isSubset(arr,target,n));
    }
}
