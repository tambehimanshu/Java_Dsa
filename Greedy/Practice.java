import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    public static int mincost(int n ,int m, Integer costVar[],Integer costHor[]){

        Arrays.sort(costVar,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int v =0;
        int h=0;
        int vp=1;
        int hp =1;
        int cost=0;

        while(v<costVar.length && h<costHor.length){
            if(costVar[v]<=costHor[h]){
                cost += (costHor[h]*vp);
                hp++;
                h++;
            }
            else {
                cost += (costVar[v]*hp);
                v++;
                vp++;
            }

        }
        while (h<costHor.length) {
            cost += (costHor[h]*vp);
            hp++;
            h++;
            
        }
        while (v<costVar.length) {
            cost+=(costVar[v]*hp);
            vp++;
            v++;
            
        }
       return cost;
    }
    public static void main(String[] args) {
      int n =4;
      int m =6;
      Integer costVar[]={2,1,3,1,4};
      Integer costHor[]={4,1,2};
      int coutn =mincost(n,m ,costVar,costHor);

      System.out.println("minimum cost : "+coutn);
    }
}