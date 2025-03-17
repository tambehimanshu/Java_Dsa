public class TownJudge {
    
    public static int findJudge(int n, int[][] trust) {

        int []count =new int[n+1];
        for(int[]t:trust){
            count[t[0]]--;
            count[t[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i]==n-1){
                return i;
            }
        }
        return  -1;
        
    }

    public static void main(String[]args){

        int [][]trust = {{1,3},{2,3},{4,3}};
        int n =4;

        int res=findJudge(n, trust);

        if(res==-1){
            System.out.println("judge not present");
        }else {
            System.out.println("judge is present "+res);
        }
    }
}
