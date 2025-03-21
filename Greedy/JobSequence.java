package Greedy;
import java.util.*;
class Job{
    int id;
    int deadline;
    int profit;

    public Job(int id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit= profit;
    }
}


public class JobSequence {

    public static void jobScheduling(Job[]jobs){
        int n = jobs.length;
    
        Arrays.sort(jobs,(a,b)->b.profit -a.profit);
    
        int maxDeadline = 0;
        for(Job job :jobs){
            maxDeadline =Math.max(maxDeadline, job.deadline);
        }
    
        int[]slot = new int[maxDeadline+1];
        Arrays.fill(slot,-1);
    
        int totalProfit = 0, countJobs = 0;
        List<Integer> jobOrder = new ArrayList<>();
    
        for(Job job :jobs){
            for(int i =Math.min(maxDeadline,job.deadline);i>0;i--){
                if(slot[i]==-1){
                    slot[i]=job.id;
                    totalProfit += job.profit;
                    countJobs++;
                    jobOrder.add(job.id);
                    break;
                }
            }
        }
        System.out.println("total jobs scheduled "+countJobs);
        System.out.println("profit "+totalProfit);
        System.out.println("joborder "+jobOrder);
    }

    public static void main(String[] args) {
        
    
    Job[]jobs={
new Job(1, 2, 100),
new Job(2, 1, 50),
new Job(3,2,10),
new Job(4,1,20),
new Job(5,3 , 80)
    };

         jobScheduling(jobs);
    
}
}
/// tc (n log n+n.d) d= maxdeadline
