import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    public static List<Integer> majority(int arr[]){  // tc O(n)  sc O(1)
        int n = arr.length;  

        int ele1 = -1, ele2 =-1;  // as n/2 so only 2 candidate(ele) can be more than n/3
        int count1 =0 , count2 = 0; // initially count =0

        for(int ele : arr){
            if(ele1 == ele){
                count1++;
            }
            else if (ele2 == ele) {
                count2++;
                
            }
            else if (count1 ==0) {
                ele1 =ele;
                count1++;
                

            }
            else if (count2 ==0) {
                ele2 =ele;
                count2++;
                
            }
            else{
                count1--;
                count2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        count1 =0;
        count2 =0;

        for(int ele : arr){ // for counting the count of ele1 and ele2;
            if(ele1 == ele) count1++;
            if(ele2 == ele ) count2 ++;
        }

        if(count1 > n/3) res.add(ele1);
        if(count2 > n/3 && ele1 != ele2) res.add(ele2);

        if(res.size()==2 && res.get(0)>res.get(1)){ //for asorting in ascending
            int temp= res.get(0);
            res.set(0,res.get(1));
            res.set(1, temp);
        }

        return res;
    }
    public static void main(String[] args) {
        
        int arr[]= {1,2,3,1,2,3,1,1,2,2,1,2};

        System.out.println(majority(arr));
    }
    
}
