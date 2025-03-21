import java.util.ArrayList;

public class Pactice {
    public static int activitySec(int start[] , int last [] ,ArrayList<Integer> ans , int count){
        ans.add(0);
        count =1;

    
        int lastend = last[0];

        for(int  i =0;i<last.length;i++){
            if(start[i]>=lastend){
                count ++;
                ans.add(i);
                lastend = last[i];
            }
        }
 return count;
    }
    public static void main(String[] args) {
        int start []={1,3,0,5,8,5};
        int last []={ 2,4,6,7,9,9};

        ArrayList<Integer>ans= new ArrayList<>();
        int count =0;

        int res= activitySec(start,last,ans,count);

        System.out.println("count is "+res);
    }
}
