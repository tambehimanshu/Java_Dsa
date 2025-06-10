package BST;

public class RecoverBST { // tc O(n) sc O(1)

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (root.data > key) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static Node first;
    static Node last;
    static Node middle;
    static Node prev;

    public static void iinorder(Node root) {
        if (root == null)
            return;
        iinorder(root.left);

        if (prev != null && (root.data < prev.data)) {
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }

        prev = root;

        iinorder(root.right);

    }

    public static void recoverTree(Node root) {
        first = last = middle = null;
        prev = new Node(Integer.MIN_VALUE);
        iinorder(root);

        if (first != null && last != null) {
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        } else if (first != null && middle != null) {
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
    }

    public static void main(String[] args) {

        // Correct BST should be: 1, 2, 3, 4, 5, 6
        int values[] = { 4, 2, 6, 1, 3, 5 };

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // Simulate a wrong BST: swap two nodes manually
        // Let's swap node with value 1 and node with value 6

        Node temp1 = root.left.left; // Node with value 1
        Node temp2 = root.right; // Node with value 6

        int temp = temp1.data;
        temp1.data = temp2.data;
        temp2.data = temp;

        // Now BST is wrong!

        // Original inorder (wrong BST)
        System.out.print(" inorder wrong BST : ");
        inorder(root);
        System.out.println();

        // Now recover the BST
        recoverTree(root);

        // Inorder after recovery
        System.out.print("Recovered inorder: ");
        inorder(root);
    }

}
