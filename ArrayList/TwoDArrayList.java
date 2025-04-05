package ArrayList;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(8);

        mainList.add(list1);
        mainList.add(list2);

        for(int i =0;i<mainList.size();i++){
            ArrayList<Integer> current = mainList.get(i);
            for(int j=0;j<current.size();j++){
                System.out.print(current.get(j)+" ");
            }
            System.out.println();
        }

        //or

        System.out.println(mainList);
    }
}
