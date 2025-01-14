package tree;

import utils.TreeNode;

/**
 * Easy
 * <p>
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * <p>
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 * <p>
 * The length of a path between two nodes is represented by the number of edges between them.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,2,3,4,5]
 * <p>
 * Output: 3
 * <p>
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1,2]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * -100 <= Node.val <= 100
 */
public class DiameterOfBinaryTree {

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(root));
    }
    private int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        diameterOfBinaryTreeUtil(root);
        return diameter;
    }

    private int diameterOfBinaryTreeUtil(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLength = root.left != null ? 1 + diameterOfBinaryTreeUtil(root.left) : 0;
        int rightLength = root.right != null ? 1 + diameterOfBinaryTreeUtil(root.right) : 0;
        diameter = Math.max(diameter, leftLength + rightLength);
        return Math.max(leftLength, rightLength);
    }
}
