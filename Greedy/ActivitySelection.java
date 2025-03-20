package Greedy;

import java.util.ArrayList;

public class ActivitySelection {

    public static int activitySec(int start[],int end [],int count,ArrayList<Integer> ans){

        count =1;
        ans.add(0); // as the activites are sorted for end so 1st end will be always added to list bcoz that activity will finish early
        int lastEnd = end[0];

        for(int i=1;i<end.length;i++){
            if(start[i]>= lastEnd){
                ans.add(i);
                count++;
                lastEnd= end[i];
            }

        }



        

        return count;
    }

    public static void main(String[]args){
        int start[]= {1,3,0,5,8,5};
        int end []= {2,4,6,7,9,9};  // end is sorted alredy

        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

       int res= activitySec(start,end ,count ,ans);
       System.out.println("maximum activity count is : "+res);

       for(int i=0;i<ans.size();i++){
        System.out.print("A"+ans.get(i)+" ");
       }

    }
    
}
