package popular;

import utils.TreeNode;

/**
 * Easy
 * <p>
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,2,2,3,4,4,3]
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1,2,2,null,3,null,3]
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 1000].
 * -100 <= Node.val <= 100
 */
public class SymmetricTree {

    public static void main(String[] args) throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        node1.left = node2;
        node1.right = node3;
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        node2.left = node4;
        node2.right = node5;
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);
        node3.left = node6;
        node3.right = node7;
        System.out.println(new SymmetricTree().isSymmetric(node1));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
