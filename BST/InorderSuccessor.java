package BST;

public class InorderSuccessor { // tc O(logn ) sc O(1)
     static class Node{
        int data;
        Node left;
        Node right ;
        public Node(int data){
            this.data = data;
        }
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

    public static Node successor(Node root , Node p){
        Node ssuccessor = null;
        while(root != null){
            if(p.data < root.data){
                ssuccessor= root;
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return ssuccessor;

    }
    public static void main(String[] args) {
        int values[]= {5,1,3,4,2,7};
        Node root = null;
        Node p = new Node(2);

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        Node res = successor(root,p);
        System.out.println("successor of "+p.data +" is "+ res.data);

    }
    
}
