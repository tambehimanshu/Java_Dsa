import java.util.Arrays;

public class TargetSubsetSum {
    public static boolean isSubsetR(int arr[],int target,int n ){
        if(n == 0 ) return false;
        if(target == 0) return true;

        if(arr[n-1] <= target){
            return isSubsetR(arr, target-arr[n-1], n-1)|| isSubsetR(arr, target, n-1);
        }
        return isSubsetR(arr, target, n-1);
    }
     public static boolean isSubsetM(int arr[],int target,int n,Boolean dp[][] ){
        if(n == 0 ) return false;
        if(target == 0) return true;

        if(dp[n][target] != null){
            return dp[n][target];
        }

        if(arr[n-1] <= target){
            dp[n][target] =isSubsetM(arr, target-arr[n-1], n-1,dp)|| isSubsetM(arr, target, n-1,dp);
        }
        else{
            dp[n][target] = isSubsetM(arr, target, n-1, dp);
        }
        return dp[n][target];
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int target = 5;
        int n = arr.length;
        Boolean dp[][]= new Boolean[n+1][target+1];
        for(Boolean row[] :dp ){
            Arrays.fill(row, null);
        }

        System.out.println(isSubsetM(arr,target,n,dp));
    }
}
