package Tree;

import java.util.Queue;

public class MaximumPathSum {
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
   
public static int findMax(Node root){ //tc O(n) sc O(n)

    int max[] =new int[1];
    max[0]=Integer.MIN_VALUE;
    maxdownpath(root,max);
    return max[0];

}
public static int maxdownpath(Node root,int[] max){
    if(root == null){
        return 0;
    }

    int left = maxdownpath(root.left , max);
    int right = maxdownpath(root.right, max);

    max[0] = Math.max(max[0], left+right+root.data);

    return root.data+ Math.max(left, right);
}
    

    public static void main(String[] args) {
        int []nodes = {-10,9,-1,-1,20,15,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
         Node root = tree.buildTree(nodes);
      
         System.out.println(findMax(root));
    }
    
}
