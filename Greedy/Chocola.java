package Greedy;
import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        int n =4;
        int m =6;

        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

    Arrays.sort(costVer,Collections.reverseOrder());
    Arrays.sort(costHor,Collections.reverseOrder());

    int h =0;
    int v =0;
    int hp=1,vp=1;  //hp=horizontal pices vp= veertical
    int cost =0;
while(h<costHor.length && v< costVer.length){
    //choosing which cut is highest that cut will be done first
    if(costVer[v]<=costHor[h]){
        cost += (costHor[h]*vp);
        hp++;
        h++;
    }
    else{
        cost += (costVer[v]*hp);
        vp++;
        v++;

    }
}
while (h<costHor.length) {
    cost += (costHor[h]*vp);
    hp++;
    h++;
    
}
while (v<costVer.length) {
    cost+= (costVer[v]*hp);
    vp++;
    v++;

    
}
System.out.println("minimum cost to cut the entire cadbury is : "+cost);

    }
    
}
//tc (mlog m*nlogn)