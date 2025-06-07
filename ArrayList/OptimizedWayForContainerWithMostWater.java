package ArrayList;

public class OptimizedWayForContainerWithMostWater { // tc O(n) sc O(1)

    public static int maxWater(int []arr){
        int left = 0, right = arr.length-1;
        int res = 0;
        while(left < right){
            int water = Math.min(arr[right], arr[left])*(right - left);
            res = Math.max(water, res);

            if(arr[left] < arr[right])
               left+=1;
            else
              right-=1;
            
        }
        return res;
    }
    public static void main(String[] args) {
        
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(arr));
    }
    
}
