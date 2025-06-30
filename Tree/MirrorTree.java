

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class MirrorTree {

    
    static void mirror(Node root) {
        if (root == null)
            return ;


		mirror(root.left);
		mirror(root.right);

        // Swap the left and right subtree
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    // Print tree as level order
    static void levelOrder(Node root) {
        if (root == null) {
            System.out.print("N ");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr == null) {
                System.out.print("N ");
                continue;
            }
            System.out.print(curr.data + " ");
            queue.add(curr.left);
            queue.add(curr.right);
        }
    }

    public static void main(String[] args) {
     
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        mirror(root);

       
        levelOrder(root);
    }
}
