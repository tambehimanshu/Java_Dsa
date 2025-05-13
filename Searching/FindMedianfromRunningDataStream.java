import java.util.ArrayList;
import java.util.PriorityQueue;

public class FindMedianfromRunningDataStream { // tc O (n * log n) sc O(n)
    public static ArrayList<Double> getMedian(int arr[]){
        PriorityQueue<Integer> leftMaxHeap = new PriorityQueue<>((a,b)-> b-a);

        PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();

        ArrayList<Double> res = new ArrayList<>();

        for(int i =0 ;i<arr.length;i++){
            leftMaxHeap.add(arr[i]);

            //remove the top element which is the largest in that heap and add to the right heap
            int temp = leftMaxHeap.poll();
            rightMinHeap.add(temp);

            // if size of both heap is not equal then remove one from right and add to left 
            if(rightMinHeap.size() > leftMaxHeap.size()){
                int temo = rightMinHeap.poll(); // top of right heap is smallest element of the heap that will add to left
                leftMaxHeap.add(temo);
            }
            double median ;
            if(leftMaxHeap.size() != rightMinHeap.size()){
                // for odd
                median = leftMaxHeap.peek();
            }
            else{
                //for even
                median = (leftMaxHeap.peek()+ rightMinHeap.peek())/2.0;
            }
            res.add(median);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]= {5,15,1,3,2,8};
    ArrayList<Double> res = getMedian(arr);
    System.out.printf("%.2f", res.get(0));
        
        for (int i = 1; i < res.size(); i++) {
            System.out.printf(" %.2f", res.get(i));
        }
    }
}
