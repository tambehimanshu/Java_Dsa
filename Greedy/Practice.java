import java.util.ArrayList;

public class Practice {
    public static int selectionActivity(int start[],int end[] ,int count,ArrayList<Integer>ans){
        ans.add(0);
        int lastend=end[0];
        count =1;

        for(int  i =1;i<end.length;i++){
            if(start[i]>= lastend){
                ans.add(i);
                count++;
                lastend = end[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int start[]={2,4,0,5,8,5};
        int end []={3,5,6,7,9,9};
        int count =0;

        ArrayList<Integer> ans = new ArrayList<>();
          int res = selectionActivity(start,end,count,ans);
          System.out.println(res);
    }
}