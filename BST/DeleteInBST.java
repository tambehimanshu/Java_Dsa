package BST;

public class DeleteInBST { // tc O(n) sc O(1)
     
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

    public static Node DeleteNode(Node root , int key){
        if(root == null) return null;
        if(root.data== key) return helper(root);

        Node dummy = root;
        while(root != null){
            if(root.data > key){
                if(root.left != null && root.left.data == key){
                    root.left = helper(root.left);
                    break;
                }
                else{
                    root = root.left;
                }
            }
            else {
                if(root.right != null && root.right.data == key){
                    root.right= helper(root.right);
                    break;
                }
                else{
                    root = root.right;
                }
            }
        }
        return dummy;
    }

    public static Node helper(Node root){
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;
        else{
            Node rightChild = root.right;
            Node lastRight = findLastRight(root.left);
            lastRight.right = rightChild;
            return root.left;
        }
    }
    public  static Node findLastRight(Node root){
        if(root.right == null) return root;
        return findLastRight(root.right);
    }
    public static void main(String[] args) {
        int values[]={ 5,3,6,2,4,-1,7};
        int key =3;
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
    System.out.println("Inorder before deletion:");
    inorder(root);
    System.out.println();

    root = DeleteNode(root, key);

    System.out.println("Inorder after deletion:");
    inorder(root);
    System.out.println();

    }
    
}
