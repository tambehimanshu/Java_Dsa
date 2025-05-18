package Tree;

public class FlatterABinarTreeToLinkedList { // tc O(n) sc O(1)
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(idx>=nodes.length||nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }
   
   static Node prev = null;
    public static Node flatten(Node root){
        if(root == null) return null;

        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left=null; // all nodes with left side will be null 

         prev= root;

         return prev;
    }
    public static void printFlattenedList(Node root) {
        Node curr = root;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.right;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int []nodes = {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,5};
        BinaryTree tree = new BinaryTree();
         Node root = tree.buildTree(nodes);
        flatten(root);
        printFlattenedList(root);
      
    }
    
}
