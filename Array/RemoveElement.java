public class RemoveElement {
    public static int findRemoveElement(int []arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
          if(arr[i] != k){
            arr[count]=arr[i];
            count++;
          }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,2,0,0};
        int k =1;

        System.out.println("Numbers of remove elements : "+findRemoveElement(arr,k));
    }
}
