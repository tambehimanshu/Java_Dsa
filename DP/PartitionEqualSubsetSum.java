package DP;

public class PartitionEqualSubsetSum { // tc O(n) sc O(1)
    public static boolean func(int nums[],int target){
        int n = nums.length;
        boolean []prev = new boolean[target+1];

        prev[0]=true;
        if(nums[0]<=target){
            prev[nums[0]]=true;
        }
        for(int i =1 ;i<n;i++){
            boolean [] curr = new boolean[target+1];
            curr[0]=true;
            for(int j=1;j<=target;j++){
                boolean notpick = prev[j];
                boolean pick = (nums[i]<= j )? prev[j-nums[i]]: false;
                curr[j] = pick || notpick;
            }
            prev = curr;
         }
         return prev[target];
    }
    public static boolean  canPartition(int[] nums) {
        int totalsum =0;
        for(int i =0;i<nums.length;i++){
            totalsum+= nums[i];
          

           
        }
        if(totalsum % 2==1){
            return false;
        }
        
          int target = totalsum /2;
         return func(nums,target);


        
    }
    public static void main(String[] args) {
        int nums[]={2,3,3,0,4,5};
        System.out.println(canPartition(nums));
    }
}
