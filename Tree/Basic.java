package Tree;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left= null;
        this.right =null;
    }
}
public class Basic {
    Node root;
    public static void preorder(Node node){
        if(node == null) return;

        System.out.println(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void main(String[] args) {
        Basic tree = new Basic();

        tree.root = new Node(1);
        tree.root.left =  new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("pre");
        tree.preorder(tree.root);
        

        
    }
    
}
