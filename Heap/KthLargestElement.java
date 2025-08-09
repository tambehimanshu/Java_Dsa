package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement { // tc O(n log k + k log k), sc O(k)
    
    public static ArrayList<Integer> findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        ArrayList<Integer>result = new ArrayList<>(pq);
        result.sort(Collections.reverseOrder());
        
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        ArrayList<Integer> result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest elements are: " + result);
    }
}
