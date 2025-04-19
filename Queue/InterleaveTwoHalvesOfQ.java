package Queue;


import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoHalvesOfQ {

    public static void interleave(Queue<Integer> q){
        int size = q.size();
        if (size % 2 !=0) {
            System.out.println("q size must be even ");
            return;
            
        }
    
        Queue<Integer> firstHalf = new LinkedList<>();
        for(int i =0;i<size/2;i++){
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // one int from firshalf 
            q.add(q.remove()); // one int from the q 
            
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);
        while (!q.isEmpty()) {
            System.err.print(q.remove()+" ");
            
            
        }
        System.out.println();

    }
    
}
//tc O(n)
//sc O(n)