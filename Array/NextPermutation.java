public class NextPermutation {

    public static void permutation(int arr[]){
        int n = arr.length;
        int pivot = -1;

         for(int i =n-2;i>0;i--){
            if(arr[i+1]> arr[i]){
                pivot = i;
                break;
            }
         }

         if(pivot == -1){
            reverse(arr,0,n-1);
            return;
         }

         for(int i = n-1;i> pivot;i--){
            if(arr[i]> arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
         }
         // rev from pivot +1 
         reverse(arr,pivot+1,n-1);

    }

    public static void reverse(int arr[],int start,int end){
        while (start< end) {
            swap(arr,start,end);
            start++;
            end--;
            
        }
    }

    public static  void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }

    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [ ] = {5,2,4,3,1};
print(arr);
        permutation(arr);
        print(arr);


    }
}
//tc O(n)
//sc O(1)