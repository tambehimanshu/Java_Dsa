package Array;
public class twoSum {
    public static int[] twosum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null; // Target not found in the array.
     
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
    
        int target = 17;
        int[] result = twosum(nums, target);

        if(!nums.equals(target)){
            System.out.println("Two numbers that add up to " + target + " are " + nums[result[0]] + " and " + nums[result[1]]);

        }else {
            System.out.println("No two numbers in the array add up to the target.");
        }
    }
}
