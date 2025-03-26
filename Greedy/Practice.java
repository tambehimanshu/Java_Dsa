import java.util.ArrayList;
import java.util.Arrays;

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

    public static int findCountOfChild(int greedy[],int size[]){
        Arrays.sort(greedy);
        Arrays.sort(size);
        int child =0;
        int cookies =0;
        while(child<greedy.length && cookies<size.length){
            if(size[cookies]>= greedy[child]){
                child++;
            }
            cookies++;
        }
        return child;
    }
    public static void main(String[] args) {
       int greedy[]={1,5,3,3,4};
       int size[]={4,2,1,2,1,3};

       int child = findCountOfChild(greedy,size);
       System.out.println("no of childern thar get cookies: "+child);
    }
}