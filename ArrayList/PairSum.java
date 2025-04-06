package ArrayList;

import java.util.ArrayList;

public class PairSum {
    public static boolean sum(ArrayList<Integer> list, int target){
        for(int i =0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if(target == list.get(i)+list.get(j)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(8);

        int target = 4;
        System.out.println(sum(list, target));
    }
    
}
//tc O(n^2) brute force approch 