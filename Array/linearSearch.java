public class linearSearch {

    public static int linearSearch(int arr[], int x){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1; 
    }
    public static void main(String[] args){
        int arr[]={1,3,4,5,7,8,9};
        int x=7;

        int result = linearSearch(arr, x);
        if(result==-1){
            System.out.println(x+" is not present in array");
        } else {
            System.out.println(x+" is present at index "+result);
        }
    }
}
