package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void findCombinations(int arr[], int index, int target, List<Integer> current, List<List<Integer>> result) {
        // Base case
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (arr[i] > target) {
                continue; // Skip
            }
         
            current.add(arr[i]);

            
            findCombinations(arr, i, target - arr[i], current, result);

            
            current.remove(current.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum(int arr[], int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); 
        findCombinations(arr, 0, target, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8};
        int target = 8;

        List<List<Integer>> combinations = combinationSum(arr, target);
        System.out.println("Unique combinations:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
//tcO(2^n)
