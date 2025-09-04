public class AllZeroToEnd {

    public static void allZero(int []arr){
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int  temp = arr[count];
                arr[count]= arr[i];
                arr[i]= temp;

                count ++;
            }
        }
    }

    // OR
     public static void allZeros(int []arr){
        int count =0;

        for(int num :arr){
            if(num !=0){
                arr[count++]=num;
            }
        }
        while(count <arr.length){
            arr[count++]=0;
        }
     }
    public static void main(String[] args) {
        int arr [] ={20,10,0,1,0,4,0,3};
        
        allZero(arr);
        //allZeros(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
} //optimized solution 
// tc O(n)
//sc O(1)
