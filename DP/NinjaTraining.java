public class NinjaTraining {// tc O(3^n) scO(n)
    public static int helper(int start , int last , int[][]activities){
        if(start ==0){
            int maxi =0;
            for(int i =0;i<=2;i++){
                if( i != last){
                    maxi= Math.max(maxi, activities[0][i]);
                }
               
            }
             return maxi;
        }

        int maxi =0;
        for(int i =0;i<=2;i++){
            if(last != i){
                int activity = activities[start][i]+helper(start-1, i, activities);

                maxi =Math.max(maxi,activity);
            }
        }
        return maxi;
    }

    public static int findMinProfitInActivities(int activities[][]){
        int n = activities.length;

        return helper(n-1, 3 , activities );

        
    }
    public static void main(String[] args) {
        int activities [][]={{10,40,70},
                         {20,50,80},
                         {30,60,90}};

        System.out.println(findMinProfitInActivities( activities));
        
    }
    

    
    
}
