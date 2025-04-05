package ArrayList;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new  ArrayList<>();
        list.add(1); //o(1)
        list.add(3);
        list.add(4);
        list.add(2);
      // for getting element from perticular index
        System.out.println(list);
        System.out.println(list.get(0));//O(1);

        // for remove 
        int remov = list.remove(2);
        System.out.println(remov);//O(n)
        System.out.println(list);
        //for setting new element on perticular index (index,value)
        list.set(0, 9);//O(n)
        System.out.println(list);

        //for checking wheather an AL contains that element or not 
        System.out.println(list.contains(9)); //O(n)

        //for size of AL
        System.out.println(list.size());

        //for loop

        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    
}
