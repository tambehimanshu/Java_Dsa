package BST;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int value ;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        left = right = null;
    }
}
public class LevelOrder {

  public static void levelOrderTrav(Node node){
  if(node == null ) return;

  Queue<Node> q = new LinkedList<>();
  q.add(node);

  while(!q.isEmpty()){
    Node curr = q.poll();

    System.out.println(curr.value +" ");
    if(curr.left != null) q.add(curr.left);
    if(curr.right != null) q.add(curr.right);
    
  }
  }
  public static void main(String[] args) {
     Node root = new Node(0);

     root.left = new Node(1);
     root.left.left = new Node(2);
     root.left.right = new Node(10);
     root.right = new Node(9);
     root.right.right = new Node(8);

     levelOrderTrav(root);


  }
    
}
