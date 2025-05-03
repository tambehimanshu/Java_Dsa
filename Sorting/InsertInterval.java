import java.util.ArrayList;

public class InsertInterval { // tc O(n) sc O(n)
    public static ArrayList<int[]> mergeinterval(int intervals[][],int newInterval[]){
        ArrayList<int[]>res = new ArrayList<>();
        int i =0;
        int n = intervals.length;
// case 1 : when the newinterval not overlap with the intervals then directly add it to res
        while(i<n && intervals[i][1]< newInterval[0]){
            res.add(intervals[i]);
            i++;

        }
        //case 2: when interval overlap with newinterval

        while(i<n && intervals[i][0]<= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1]= Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        res.add(newInterval);
        // case 3 : add remaining intervals after the merge 
        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        int intervals[][]= {{1,3},{4,5},{6,7},{8,10}};
        int newInterval[]={5,6};

       ArrayList<int[]> sv= mergeinterval(intervals,newInterval);
       for(int []show :sv){
        System.out.println( show[0]+" "+show[1]);
       }
    }
}
