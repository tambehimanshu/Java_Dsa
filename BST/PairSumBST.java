import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class PairSumBST {

    // Function to find if pair exists
    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> inorderList = new ArrayList<>();
        inorderTraversal(root, inorderList);

        int left = 0, right = inorderList.size() - 1;

        while (left < right) {
            int sum = inorderList.get(left) + inorderList.get(right);
            if (sum == k)
                return true;
            else if (sum < k)
                left++;
            else
                right--;
        }
        return false;
    }

    // Inorder traversal to get sorted list of node values
    private static void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }

   
    public static void main(String[] args) {
      

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        int target = 9;

        boolean result = findTarget(root, target);
        System.out.println("Pair with sum" + target + "exists: " + result);
    }
}
