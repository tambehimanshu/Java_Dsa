package ArrayList;

import java.util.ArrayList;

public class PairSum2 {

    public static boolean sum(ArrayList<Integer> list , int target){
        int bp =-1 ;// breaking point
        int n =list.size();
        for(int i =0;i<list.size()-1;i++){
            if(list.get(i)> list.get(i+1)){
                bp =i;
                break;
            }
        }

       int  leftp=bp+1;
        int rightp=bp;

        while(leftp != rightp){
            if(list.get(rightp)+list.get(leftp)== target){
                return true;
            }
            if(list.get(rightp)+list.get(leftp)< target){
                leftp = (leftp +1)%n;
            }
            else {
                rightp = (rightp +n-1 )%n;
               
            }
        }return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(sum(list,target));
    }
    
}
//tc O(n)