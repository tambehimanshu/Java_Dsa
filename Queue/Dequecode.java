package Queue;

import java.util.*;

public class Dequecode {
    public static void main(String[] args) {
    Deque<Integer> deque = new LinkedList<>();
      deque.addFirst(1);
      deque.addFirst(2);
      deque.addFirst(3);
      deque.addFirst(4);

      System.out.println(deque);
      deque.removeFirst();
      System.out.println(deque);
      System.out.println(deque.getFirst());
    }
    
}