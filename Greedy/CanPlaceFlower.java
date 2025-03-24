package Greedy;

public class CanPlaceFlower {
    public static boolean canPlaceFlowers(int[] flowerBed, int n) {
        int flowerBedSize = flowerBed.length;
        for(int i =0;i<flowerBedSize;i++){
            boolean prev = i==0 || flowerBed[i-1]==0;
            boolean future =i==flowerBedSize -1 || flowerBed[i+1]==0;
            if(prev && future && flowerBed[i]==0){
                flowerBed[i]=1;
                n--;
            }
        }

        return n<=0;
    }
        
    
    public static void main(String[] args) {
        int flowerBed[]={ 1,0,0,0,1};
        int n =1;

       System.out.println("can we place flower ? true/false :"+canPlaceFlowers(flowerBed,n)); 
    }
    
}
// tc O(n)
// O(1)

