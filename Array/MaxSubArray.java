public class MaxSubArray {
    public static void maxSubAraay(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currsum =0;

        for (int i =0 ;i< arr.length;i++){
            for (int j =i;j<arr.length;j++){
            currsum =0;
            for(int k=i;k<=j;k++){
                currsum = currsum + arr[k];
            }
           
            if(maxSum< currsum){
                maxSum = currsum;
            }
            }
        }
        System.out.println("maximun sub array :"+maxSum);
    }
    public static void main (String []args){
        int arr[]={-1,2,-2,4,3,6,-2,3,-6};

        maxSubAraay(arr);

    }
    
}
