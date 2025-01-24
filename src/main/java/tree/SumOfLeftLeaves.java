package tree;

import utils.TreeNode;

/**
 * Easy
 * <p>
 * Given the root of a binary tree, return the sum of all left leaves.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * <p>
 * Output: 24
 * <p>
 * Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 1000].
 * -1000 <= Node.val <= 1000
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        return inorder(root, false);
    }

    private int inorder(TreeNode node, boolean isLeft) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                if (isLeft) {
                    return node.val;
                } else return 0;
            }
            return inorder(node.left, true) + inorder(node.right, false);
        }
        return 0;
    }

}
