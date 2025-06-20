public class SearchingInsertionPosition {
    public static int searchTarget(int nums[],int target){
        int n = nums.length;

        for(int i =0;i<n;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        
        int nums[]={0,1,3,6};
        int target= 2;
        System.out.println(searchTarget(nums, target));
    }
}
