package tree;

import utils.TreeNode;

/**
 * Medium
 * <p>
 * Given the root of a binary tree and an integer limit, delete all insufficient nodes in the tree simultaneously, and return the root of the resulting binary tree.
 * <p>
 * A node is insufficient if every root to leaf path intersecting this node has a sum strictly less than limit.
 * <p>
 * A leaf is a node with no children.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14], limit = 1
 * <p>
 * Output: [1,2,3,4,null,null,7,8,9,null,14]
 * <p>
 * Example 2:
 * <p>
 * Input: root = [5,4,8,11,null,17,4,7,1,null,null,5,3], limit = 22
 * <p>
 * Output: [5,4,8,11,null,17,4,7,null,null,null,5]
 * <p>
 * Example 3:
 * <p>
 * Input: root = [1,2,-3,-5,null,4,null], limit = -1
 * <p>
 * Output: [1,null,-3,4]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 5000].
 * -10^5 <= Node.val <= 10^5
 * -10^9 <= limit <= 10^9
 */
public class InsufficientNodesInRootToLeafPaths {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(-5);
        root.right = new TreeNode(-3);
        root.right.left = new TreeNode(4);
        TreeNode node = new InsufficientNodesInRootToLeafPaths().sufficientSubset(root, -1);
        System.out.println(node.val);
        System.out.println(node.right.val);
        System.out.println(node.right.left.val);
    }

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return sufficientSubset(root, limit, 0, root.left == null && root.right == null) < limit
                ? null
                : root;
    }

    public int sufficientSubset(TreeNode root, int limit, int sum, boolean isLeaf) {
        if (root != null) {
            int leftSum =
                    sufficientSubset(
                            root.left,
                            limit,
                            sum + root.val,
                            root.left == null && root.right == null);
            int rightSum =
                    sufficientSubset(
                            root.right,
                            limit,
                            sum + root.val,
                            root.left == null && root.right == null);
            if (leftSum < limit) {
                root.left = null;
            }
            if (rightSum < limit) {
                root.right = null;
            }
            return Math.max(leftSum, rightSum);
        }
        return isLeaf ? sum : Integer.MIN_VALUE;
    }
}
