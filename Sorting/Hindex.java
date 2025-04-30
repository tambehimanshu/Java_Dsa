package Sorting;

public class Hindex {
    public static int index(int []citations){
        int n = citations.length;
        int [] freq = new int[n+1];

        for(int i =0;i<n;i++){
            if(citations[i]>=n){
                freq[n]+=1;
            }
            else{
                freq[citations[i]]+=1;
            }
        }
            int idx = n;
            int s = freq[n];

            while(s<idx){
                idx--;
                s+=freq[idx];
            }
            return idx;
        
    }
    public static void main(String[] args) {
        int []citations = {6,0,3,5,3};
        System.out.println(index(citations));
    }
}//tc O(n)
//sc O(n)
