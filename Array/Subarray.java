public class Subarray {

    public static void printSubarray (int arr []){
        for (int i =0;i< arr.length;i++){
            int first =i;
            for(int j =i+1;j< arr.length;j++){
                int last = j;
                for(int k = first ; k< last ;k++){
                    System.out.print(arr[k]+"");
                }
                System.out.print(" ");

            }
            System.out.println();
        }
    }
    public static void main(String []args){
        int arr []={1,3,5,7,9,0};

        printSubarray(arr);
    }
    
}
