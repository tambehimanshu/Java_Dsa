package Tree;



public class DiameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left = null;
            this.right=null;
        }
    }


    static class BinaryTree{
        static int idx ;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1 || idx >=nodes.length){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right= BuildTree(nodes);

            return newNode;
        }
    }

    public static int diameter(Node root){ // tc O(n) sc O(n)
       int[] dmeter = new int[1];
       height(root,dmeter);
       return dmeter[0];
    }
    public static int height(Node root,int[]dmeter){
        if(root == null){
            return 0;
        }

        int left= height(root.left, dmeter);
        int right = height(root.right, dmeter);
        dmeter[0]=Math.max(dmeter[0],left+ right);
        return 1+Math.max(left, right);
    }
    public static void main(String[] args) {
        int nodes[]= {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,5,-1,-1};
        BinaryTree.idx =-1;
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println(diameter(root));


        
    }
    
}
