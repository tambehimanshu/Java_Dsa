import java.util.*;

class Job {
    int id;
    int deadline;
    int profit;

    public Job(int id, int deadline,int profit){
        this.id=id;
        this.deadline = deadline;
        this.profit = profit;

    }
}

public  class Practice {
    public static void jobSeq(Job[]jobs){
        int n = jobs.length;
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);

        int maxdeadline = 0;
        for(Job job:jobs){
            maxdeadline += Math.max(maxdeadline,job.deadline);
        }

        int []slot=new int[maxdeadline+1];
        Arrays.fill(slot, -1);

        int totalProfit= 0, countJobs=0;
        List<Integer> jobOrder = new ArrayList<>();

        for(Job job :jobs){
            for(int i=Math.min(maxdeadline, job.deadline);i>0;i--){
                if(slot[i]==-1){
                    slot[i]=job.id;
                    totalProfit += job.profit;
                    countJobs++;
                    jobOrder.add(job.id);
                    break;
                }
            }
        }

        System.out.println("total jobs : "+countJobs);
        System.out.println("profit "+totalProfit);
        System.out.println("jobOrder "+jobOrder);
    }


    public static void main(String[] args) {
        Job []jobs={
            new Job(1, 2, 100),
            new Job(2, 1, 50),
            new Job(3, 2, 10),
            new Job(4, 1, 20),
            new Job(5, 3, 80)
        };


        jobSeq(jobs);
    }
}