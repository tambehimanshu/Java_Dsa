package Greedy;
import java.util.*;

public class AssigningCookies {

    public static int findContentChildren(int greedy[],int size[]){
        Arrays.sort(greedy);
        Arrays.sort(size);

        int child =0;
        int cookies = 0;
        while(child <greedy.length&& cookies<size.length){
            if(size[cookies]>=greedy[child]){
                child++;
            }
            cookies ++;
        }
        return child;
    }
    public static void main(String[] args) {
        int greedy[]={1,5,3,3,4};
        int size[]={4,2,1,2,1,3};

     int child=findContentChildren(greedy,size);
     System.out.println("no of childrens are : "+child);
    }
    
}
