package BST;

public class LargestBSTInBinaryTree { // tc O(n) sc O(n)
    static class Node{
        int data;
        Node left;
        Node right ;
        public Node(int data){
            this.data = data;
        }
    }
    static class NodeValue{
    public int maxNode, minNode,maxSize;
    NodeValue(int minNode,int maxNode,int maxSize){
        this.maxNode = maxNode;
        this.minNode = minNode;
        this.maxSize = maxSize;
    }
    }

    public static NodeValue largetsBSTFromBTHelper(Node root){
        if(root == null){
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE,0);
        }

        NodeValue left  = largetsBSTFromBTHelper(root.left);
        NodeValue right = largetsBSTFromBTHelper(root.right);

        if(left.maxNode < root.data && root.data < right.minNode){
            // bst condition satisfy
            return new NodeValue(Math.min(root.data, left.minNode),Math.max(root.data,right.maxNode), left.maxSize+right.maxSize+1);
        }
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
    }
 public static int largetsBSTFromBT(Node root){
    return largetsBSTFromBTHelper(root).maxSize;
 }
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data> val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null)
        return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        int values[]= {5,8,3,4,2,7};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
         int largestBSTSize = largetsBSTFromBT(root);
        System.out.println("Largest BST size in Binary Tree = " + largestBSTSize);
    

    }
    
}
