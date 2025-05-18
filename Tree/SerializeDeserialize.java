import java.util.LinkedList;

import java.util.Queue;



public class SerializeDeserialize { // tc O(n) sc O(n)
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
   // serialize the tree to string with the levelorder

   public static String serailize(Node root){
    if(root == null){
        return " ";
    }
    Queue<Node> q= new LinkedList<>();
    StringBuilder res = new StringBuilder();
    q.add(root);

    while(!q.isEmpty()){
        Node curr= q.poll();
        if(curr == null){
            res.append("n ");
            continue;
        }
        res.append(curr.data +" ");
        q.add(curr.left);
        q.add(curr.right);
    }
    return res.toString();
   }

   //de-Serialize the string back to tree

   public static Node deSerialize(String data){
    if(data== "n" || data.trim().isEmpty() ){
        return null;
    }
    Queue<Node>q = new LinkedList<>();
    String [] values  = data.split(" ");

    Node root = new Node(Integer.parseInt(values[0]));
    q.add(root);
    
    int i =1;
    while(!q.isEmpty() && i <values.length ){
        Node parent = q.poll();
        if(i<values.length && !values[i].equals("n")){
            Node left = new Node(Integer.parseInt(values[i]));
            parent.left = left;
            q.add(left);
        }
        i++;
         if(i<values.length && !values[i].equals("n")){
            Node right = new Node(Integer.parseInt(values[i]));
            parent.right   = right  ;
            q.add(right);
        }
        i++;

    }
    return root;
   }
 public static void levelOrder(Node root){ // also known as BFS

        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null); // for next line

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if(curr == null){
                System.out.println( " ");

                if(q.isEmpty()){
                    break; // means last element
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            

            }
            
        }
    

    public static void main(String[] args) {
        int []nodes = {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,5};
        BinaryTree tree = new BinaryTree();
          BinaryTree.idx =-1;
         Node root = tree.buildTree(nodes);
        String serialized = serailize(root);
        System.out.println("serialized : "+serialized);

        Node deserialized = deSerialize(serialized);
        levelOrder(deserialized);
      
    }
}
