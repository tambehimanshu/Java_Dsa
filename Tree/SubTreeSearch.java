package Tree;

import java.util.Queue;

public class SubTreeSearch {

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
   public static boolean findSubTree(Node root , Node subTree){

    if(root == null){
        return false;
    }
    if(root.data == subTree.data){
        if(isIdentical(root, subTree)){
            return true;
        }
    }
    return findSubTree(root.left,subTree) || findSubTree(root.right, subTree);
   }
    
   public static boolean isIdentical(Node root, Node subTree){

    if(root == null && subTree == null){
        return true;
    }
    
    else if(root == null || subTree == null || root.data != subTree.data){
        return false;
    }

    if(!isIdentical(root.left, subTree.left)){
        return false;
    }
    if(!isIdentical(root.right, subTree.right)){
        return false;
    }
    return true;
   }



    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left= new Node(6);
        root.right.right = new Node(7);

        Node subTree = new Node(2);
        subTree.left= new Node(4);
       subTree.right = new Node(5);
System.out.println(findSubTree(root, subTree));
    }
    
}
