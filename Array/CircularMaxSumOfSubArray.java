public class CircularMaxSumOfSubArray {

    public static int FindCircularSum(int arr[]){
        int  n = arr.length;
        int currMaxSum =0 , currMinSum =0 ,totalSum =0;
        int maxSum=arr[0] , minSum = arr[0];

        for(int i =0;i<n;i++){
            currMaxSum = Math.max(currMaxSum+arr[i],arr[i]);
            maxSum = Math.max(maxSum, currMaxSum);

            currMinSum = Math.min(currMinSum+arr[i], arr[i]);

            minSum = Math.min(minSum, currMinSum);
            System.out.println(minSum);
            
            totalSum += arr[i];

        }
        int normalSum = maxSum;
        int circularSum = totalSum - minSum; // circular sum = total (11) - minSum(-11) = 11-(-11) = 22

        if(minSum == totalSum){
            return normalSum;
        }

        return Math.max(normalSum, circularSum);
        
    }
    public static void main(String[] args) {
        int arr[ ]= {8,-8,9,-9,10,-11,12};
System.out.println(FindCircularSum(arr));

    }
}
//tc O(n)
//sc O(1)
