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

    public static boolean canPlaceFolower(int folwerBed[],int n){
        int folwerBedSize =folwerBed.length;
        for(int i =0;i<folwerBedSize;i++){
            boolean prev = i==0 || folwerBed[i-1]==0;
            boolean future =i== folwerBedSize-1 || folwerBed[i+1]==0;
            if(prev && future && folwerBed[i]==0){
                folwerBed[i]=1;
                n--;
            }
        }
        return n<=0;
    }
    public static void main(String[] args) {
       int folwerBed[]={1,0,0,0,1};
       int n =2;


       System.out.println("can placed flower : "+canPlaceFolower(folwerBed, n));

    }
}