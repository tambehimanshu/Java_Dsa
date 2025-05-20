package Tree;

import java.util.*;
public class RightLeftViewOfBinaryTree { //tc O(n) sc O(n)
        static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
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
   public static List<Integer> rightSideView(Node root , int level){
    List<Integer> res = new ArrayList<>();
    rightView(root, res , 0);
return res;

   }
   public static void rightView(Node curr, List<Integer> res , int currdepth){
    if(curr == null){
        return;
    }
    if(currdepth == res.size()){
        res.add(curr.data);
    }
    rightView(curr.right, res, currdepth+1); // in left view just call curr.left then curr.right means swap both lines
    rightView(curr.left, res, currdepth+1);
   }


    

    public static void main(String[] args) {
        int []nodes = {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,5};
        BinaryTree tree = new BinaryTree();
         Node root = tree.buildTree(nodes);
         int level = 0;
         List<Integer> show = rightSideView(root, 0);
         for(int ds : show){
            System.out.println(ds);
         }

      
    }
    
}
