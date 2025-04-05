package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(19);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
