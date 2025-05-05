package Sorting;

public class MergeWithoutExtraSpace { // tc O(m+n)*O(log(m+n)) scO(1)
    public static void merge(int a[],int b[]){
        int n = a.length;
        int m = b.length;

        int gap =(m+n+1)/2;

        while (gap>0) {
            int  i = 0 ;
            int  j = gap;
            while(j<n+m ){

                //case 1 : when both i and j in a[]

                if(j<n && a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

                // case 2 : when i int a[] and j in b[]
                if(j>=n && i<n && a[i]> b[j-n]){
                    int temp = a[i];
                    a[i]= b[j-n];
                    b[j-n] = temp;
                }
                // case 3 : when i and j in b[]
                if(i>=n && b[i-n]> b[j-n]){
                    int temp = b[i-n];
                    b[i-n]= b[j-n];
                    b[j-n]=temp;
                }
                i++;
                j++;
            }
            if(gap ==1){
                break;
            }
            gap = (gap +1)/2;
            
        }
    }
    public static void main(String[] args) {
        int a[]= {2,4,7,10};
        int b[]= {2,3};
        merge(a, b);

        for(int ele :a ){
            System.out.print(ele+" ");
           
        }
        System.out.println();
        for(int ele :b){
            System.out.print(ele+" ");
        }

    }
}
