package DP;

public class EditDistance { //tc O(n*m) sc O(m)
    public static int findMinOp(String s1 ,String s2){
        int n =s1.length();
        int m = s2.length();

        int prev[]=new int[m+1];
        int curr[]= new int [m+1];
        for(int j=0;j<=m;j++){
            prev[j]= j;

        }
        for(int i =1;i<=n;i++){
            curr[0]=i;
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)== s2.charAt(j-1)){
                    curr[j]= prev[j-1];

                }
                else{
                    curr[j]= 1+Math.min(prev[j],Math.min(curr[j-1],prev[j-1 ]));
                }
            }
             int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prev[m];

    }
    public static void main(String[] args) {
        String s1 = "horse";
        String s2 = "ros";

        System.out.println(findMinOp(s1,s2));
    }
}
