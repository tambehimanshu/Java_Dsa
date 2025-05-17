package Tree;

public class CheckTwoTreeAreIdentical {
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

    public static boolean isIdentical(Node root ,Node node){
        if(root == null || node == null){
            return (root == node); // if both are null then true else false
        }

        return (root.data == node.data)&& 
              isIdentical(root.left, node.left) &&
              isIdentical(root.right, node.right);
    }
   

    

    public static void main(String[] args) {
        int []nodes1 = {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,5};
         int []nodes2 = {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,5};
        BinaryTree tree = new BinaryTree();
           BinaryTree.idx = -1;
        Node root = BinaryTree.buildTree(nodes1);

        BinaryTree.idx = -1;
        Node node = BinaryTree.buildTree(nodes2);
         System.out.println(isIdentical(root, node));
    }
    
}
