package Tree;

import java.util.Queue;

import java.util.LinkedList;


public class MaximumWidthOfBinary {

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
 static class Pair{
    int num;
    Node node;
    public Pair(int num,Node node){
        this.num = num;
        this.node=node;
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
   public static int maxWidth(Node root){
    if(root == null) return 0;
    int ans =0;
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(0, root));

    while (!q.isEmpty()) {
        int size = q.size();
        int min = q.peek().num;
        int first =0, last =0;
        for(int i =0;i<size;i++){
            int currId = q.peek().num-min;
            Node node =q.peek().node;
            q.poll();
            if(i==0) first =currId;
            if(i==size-1) last = currId;
            if(node.left != null){
                q.add(new Pair(currId*2+1,node.left));
            }
             if(node.right != null){
                q.add(new Pair(currId*2+2,node.right));
            }
            
        }
        ans = Math.max(ans, last-first+1);
       
        
    }
     return ans;
   }

    

    public static void main(String[] args) {
       int[] nodes = {1, 2, 3, 4, -1, -1, 5, -1, -1, 6, -1, -1, 7, -1, -1};

        BinaryTree tree = new BinaryTree();
        BinaryTree.idx =-1;
         Node root = tree.buildTree(nodes);
         System.out.println(maxWidth(root));
      
    }
    
}
