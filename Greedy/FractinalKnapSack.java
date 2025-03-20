package Greedy;
import java.util.*;

import java.util.Comparator;

public class FractinalKnapSack {
    public static int  knapSack(int val[],int weight[],int maxCap){

        int finalValue=0;
        double ratio [][]= new double[val.length][2];
        //0th col -> index and 1st col -> ratio

        for(int i =0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i]; // for finding the ratio 


        }
        Arrays.sort(ratio, Comparator.comparingDouble((o->o[1])));
        //sorted the ratio array in ascending 

        // but we require descending order sorting for choosing the hightest ratio 
        //for that reverse loop we will apply
        
        int capacity = maxCap;
        for(int i =ratio.length-1;i>=0;i--){
            int idx=(int) ratio[i][0];
            if(capacity>= weight[idx]){
                finalValue += val[idx];
                capacity -= weight[idx];

            }
            else{
                // for fractional adding
                finalValue += (ratio[i][1]*capacity);
                capacity=0;
                break;
            }

        }



        return finalValue; 
    
    }

    public static void main(String[] args) {
        int val []={60,100,120};
        int weight[]={10,20,30};
        int maxCap = 50;

        int res = knapSack(val,weight,maxCap);
        System.out.println("maximum val knapSack can have : "+res);
    }
    
}
