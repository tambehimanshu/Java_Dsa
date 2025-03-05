package Sorting;

public class MergeSort {

    public static void conq(int arr[],int start,int mid,int end){
        int merged[]=new int[end-start+1];

        int idx1 = start;
        int idx2= mid+1;
        int x =0;


        while(idx1<= mid && idx2<= end){
         if(arr[idx1]<=arr[idx2]){
            merged[x++]=arr[idx1++];
         }else{
            merged[x++]=arr[idx2++];
         }
        }

        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=end){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=start;i<merged.length;i++,j++){
arr[j]=merged[i];
        }

    }

    public static void divide(int arr[],int start,int end){
        if(start>= end){
            return ;
        }

        int  mid = start+(end-start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conq(arr,start,mid,end);
    }
    public static void main(String[]args){
        int arr[]={9,1,8,4,7,2,3};

        int n = arr.length;
        divide(arr,0,n-1);

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
