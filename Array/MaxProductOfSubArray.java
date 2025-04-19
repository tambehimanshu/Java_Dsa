public class MaxProductOfSubArray {
    public static int findmax(int arr[]){
        int n = arr.length;
         int maxProd = Integer.MIN_VALUE;
          int leftToRight = 1;
          int rightToLeft =1;

          for(int i =0;i<n;i++){
            if (leftToRight ==9) {
                leftToRight =1;
                
            }
            if(rightToLeft ==0){
                rightToLeft =1;
            }
            leftToRight *= arr[i];

            int j = n-i-1;
            rightToLeft *= arr[j]; // from last 

            maxProd =Math.max(leftToRight,Math.max(rightToLeft, maxProd));

          }
          return maxProd;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,-2,4};

      System.out.println(findmax(arr));
    }
}

//tc O(n)
//sc O(1)
