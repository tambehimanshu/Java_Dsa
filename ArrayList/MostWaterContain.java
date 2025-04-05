package ArrayList;

import java.util.ArrayList;

public class MostWaterContain {
    public static int  storeWater(ArrayList<Integer> height){
        int max= 0;
        for(int i =0;i<height.size();i++){
            for(int j =i+1;j<height.size();j++){
                int h = Math.min(height.get(i), height.get(j));
                int w = j-i;
                int currWater = h*w;
                max =Math.max(max, currWater);
            }
        }
        return max;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
        
    }
    
}
//tc O(n^2);
