package Tree;
import java.util.*; 
public class BoundaryTraversal {  // tc O(n) sc O(n)
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
   
 public static boolean isLeaf(Node root){
    if(root.left== null && root.right ==null){
        return true;
    }
    return false;
 }
    public static void addLeftBoundary(Node root ,ArrayList<Integer> res){
        Node curr = root.left;
        while(curr != null){
            if(isLeaf(curr) == false) res.add(curr.data);
            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }
    public static void addRightBoundary(Node root,ArrayList<Integer> res){
        Node curr = root.right;
        ArrayList<Integer> tmp =new ArrayList<Integer>();
        while(curr != null){
            if(isLeaf(curr)==false) tmp.add(curr.data);
            if(curr.right != null) curr = curr.right;
            else curr= curr.left;
        }

        int  i;
        for(i = tmp.size()-1;i>=0;--i){
            res.add(tmp.get(i));
            

        }
    }

    public static void addleaves(Node root, ArrayList<Integer> res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        if(root.left != null) addleaves(root.left,res);
        if(root.right!= null) addleaves(root.right,res);
    }

    public static ArrayList<Integer> printBoundary(Node root){
        ArrayList<Integer>ans= new ArrayList<Integer>();
        if(isLeaf(root)==false) ans.add(root.data);
        addLeftBoundary(root,ans);
        addleaves(root, ans);
        addRightBoundary(root,ans);
        return ans; 
    }
    

    public static void main(String[] args) {
        int []nodes = {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,5};
        BinaryTree tree = new BinaryTree();
    
         Node root = tree.buildTree(nodes);
        ArrayList<Integer> boundary= printBoundary(root);
        System.out.println(boundary);
    
      
    }
}
