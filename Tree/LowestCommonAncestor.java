package Tree;

public class LowestCommonAncestor { // tc O(N) sc O(N)
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

    public static Node findlca(Node root , Node p, Node q){
        if(root == null || root == p|| root ==q){ // base case
            return root;
        }

        Node left = findlca(root.left, p, q);
        Node right = findlca(root.right, p, q);

        if( left == null) return right;
        if(right == null) return left;
        else{
            return root;  // we will ans in this case when both left and right will be present then we will return the root 
        }
    }
   
  public static Node findNode(Node root, int val) {
        if (root == null) return null;
        if (root.data == val) return root;

        Node left = findNode(root.left, val);
        if (left != null) return left;

        return findNode(root.right, val);
    }
    

    public static void main(String[] args) {
       int[] nodes = {
    3,
    5,
    6, -1, -1,
    2,
    7, -1, -1,
    4, -1, -1,
    1,
    -1,
    0, -1, -1
};

        BinaryTree tree = new BinaryTree();
         Node root = tree.buildTree(nodes);
         Node p =findNode(root, 5);
         Node q= findNode(root, 1);
        Node lca = findlca(root, p, q);
        if(lca != null){
            System.out.println("lca of ["+p.data+" "+q.data+"] is "+lca.data);
        }else{
            System.out.println("lca not found");
        }
     
      
}
}
