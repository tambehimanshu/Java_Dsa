package Tree;
import java.util.*;



public class BottomViewOfBinaryTree { //tc O(n) sc O(n)
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

    static class Tuple{
        Node node;
        int hd;

        Tuple(Node node ,int hd){
            this.node = node;
            this.hd=hd;
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

    public static ArrayList<Integer> bottom(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        TreeMap<Integer,Integer> map = new TreeMap<>(); 
        Queue<Tuple> q = new LinkedList<>();
    
  
        q.add(new Tuple(root, 0));
        while (!q.isEmpty()) {
            Tuple t = q.poll();
            Node node = t.node;
            int hd = t.hd;
            map.put(hd, node.data);
            if(node.left != null){
                
                q.add(new Tuple(node.left, hd-1));
            }
              if(node.right != null){
               
                q.add(new Tuple(node.right, hd+1));
            }
        }
        for(int val : map.values()){
            ans.add(val);
        }
        return ans;
    }
   

    

    public static void main(String[] args) {
      int[] nodes = {
    20,
    8,
    5, -1, -1,
    3,
    10, -1, -1,
    14, -1, -1,
    22,
    -1,
    25, -1, -1
};
        BinaryTree tree = new BinaryTree();
         Node root = tree.buildTree(nodes);
         ArrayList<Integer> view = bottom(root);
         System.out.println("bottom view : "+view);
}
}
