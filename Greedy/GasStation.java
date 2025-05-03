package Greedy;

public class GasStation { //tc (n) sc O(1)
    public static int findStartingStation(int gas[] ,int cost[]){
        int currGas = 0;
        int totalGas =0;
        int startIdx = 0;

        for(int i =0;i<gas.length;i++){
            currGas +=gas[i]-cost[i];
            totalGas += gas[i]-cost[i];
            
            if(currGas <0){
                currGas=0;
                startIdx = i+1;
            }
        }
        if(totalGas <0){
            return -1;
        }
        return startIdx;
    }
  public static void main(String[] args) {
    int gas[]={4,5,7,4};
    int cost[]= {6,6,3,5};

    System.out.println("starting index of station is: "+findStartingStation(gas,cost ));
  }   
}
