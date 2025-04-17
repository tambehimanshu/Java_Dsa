import java.util.Arrays;

public class MinimizeMaxDiffBtnHeight {
    public static int findMinDiff(int arr[],int k){
        int n = arr.length;
        Arrays.sort(arr);
        int res = arr[n-1] - arr[0];

        for(int i =1;i<n;i++){
            if(arr[i]-k<0){
                continue;
            }

            int minH = Math.min(arr[0]+k, arr[i]-k);
            int maxh = Math.max(arr[i-1]+k, arr[n-1]-k);

            res = Math.min(res, maxh-minH);

        }
        return res;

        
    }
    public static void main(String[] args) {
        int arr[]={12,6,4,15,17,10};

        int key = 6;
        System.out.println(findMinDiff(arr, key));
    }
    
}
//tc O(nlogn)
//sc O(1)