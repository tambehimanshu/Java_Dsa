import java.util.*;
public class MedianOfTwoSortedArray { // tc O(n) sc (1)

    public static double findMedian(int a[],int b[]){
        int  n = a.length;
        int m = b.length;

    if(n>m){
        return findMedian(b, a);
    }

    int low = 0 , high = n;
    while(low <= high){
        int mid1 = low+(high-low)/2;//  i1
        int mid2 = (n+m+1)/2 - mid1;//i2

        //here we find the left and right partation . mid(i1) will be start of right partation and mid-1(i1-1) is the end of left partation and same of the next array
        int max1 = (mid1 ==0) ? Integer.MIN_VALUE :a[mid1-1]; //  i1-1
        int min1 = (mid1 ==n) ? Integer.MAX_VALUE : a[mid1];//i1

        int max2 = (mid2 == 0) ?Integer.MIN_VALUE : b[mid2-1]; // i2-1
        int min2 =(mid2 == m) ? Integer.MAX_VALUE : b[mid2];
// if both max's are smaller than min's then find the median and if any one of the two condtion exploid then check down from where we will reduce the binary search
        if(max1 <= min2 && max2 <= min1){
            if((m+n) % 2 ==0){
                return (Math.max(max2, max1)+Math.min(min1, min2))/2.0; 
            }
            else{
               return Math.max(max2, max1);
            }
        }
        // if max1 is big then min2 then move high to left 
         if(max1 > min2){
            high = mid1-1;
         }
         else{
            // move to right
            low = mid1+1;
         }



      }
      return 0;
    }
    public static void main(String[] args) {
        int[] a = {1, 12, 15, 26, 38};
        int[] b = {2, 13, 17, 30, 45};

        System.out.println(findMedian(a,b));
    }
    
}
