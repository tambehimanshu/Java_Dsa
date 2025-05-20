package Tree;

import java.util.*;

public class IntervativeAppForPreorderInorder {
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
   public static List<Integer> findPreorder(Node root){// tc O(n) sc O(n)
    List<Integer> res = new ArrayList<Integer>();
    Stack<Node> st = new Stack<Node>();
    if (root == null) {
        return res;
        
    }
    st.push(root);
    while (!st.isEmpty()) {
        root = st.pop();
        res.add(root.data);

         if(root.right != null){
          st.push(root.right);
        }

        if(root.left != null){
            st.push(root.left);
        }
       
        
    }
    return res;

   }

      public static List<Integer> findInorder(Node root){ // tc O(n) sc O(n)
    List<Integer> res = new ArrayList<Integer>();
    Stack<Node> st = new Stack<Node>();
    
       Node node = root;
       while(true){
        if(node != null){
            st.push(node);
            node = node.left;
        }
        else{
            if(st.isEmpty()){
            break;
            }
            node = st.pop();
            res.add(node.data);
            node = node.right;
        }
       }
       
        
    
    return res;

   }

   public static List<Integer> postOrder(Node root){ // tc O(n) sc O(n)
    Node node = root;
    Stack<Node> st1 = new Stack<Node>();
    Stack<Node> st2 = new Stack<Node>();
    List<Integer> res = new ArrayList<Integer>();

    if(node == null){
        return res;
    }
    st1.push(node);
    while(!st1.isEmpty()){
        node = st1.pop();
        st2.push(node);
        if (node.left != null) {
            st1.push(node.left);
        }
        if(node.right !=null){
            st1.push(node.right);
        }
    }
    while(!st2.isEmpty()){
        res.add(st2.pop().data);
    }
  return res;


   }
    

    public static void main(String[] args) {
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,-1};
        BinaryTree tree = new BinaryTree();
         Node root = tree.buildTree(nodes);
         List<Integer> res = postOrder(root);
         for(int show : res){
            System.out.print(show+" ");
         } 
     
      
    }
}
