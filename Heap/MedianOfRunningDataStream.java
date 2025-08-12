package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MedianOfRunningDataStream { // tc O(n log n), sc O(n)
    private static ArrayList<Double> findMedian(int[] arr) {
        PriorityQueue<Integer> leftMax = new PriorityQueue<>((a,b)->b-a);
        
        PriorityQueue<Integer> rightMin = new PriorityQueue<>();
        ArrayList<Double> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            leftMax.add(arr[i]);
            
            int temp = leftMax.poll();
            rightMin.add(temp);
            
            if(rightMin.size() > leftMax.size()){
                temp = rightMin.poll();
                leftMax.add(temp);
            }
            
            double median;
            if(leftMax.size()!= rightMin.size())
            {
                  median = leftMax.peek(); 
            }
         
            else{
                median = (leftMax.peek()+rightMin.peek())/2.0; 
            }
           
            
            res.add(median);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]= {1, 5, 2, 4, 3};
        ArrayList<Double> result = findMedian(arr);
        System.out.println("The running median is: " + result);
    }
}
