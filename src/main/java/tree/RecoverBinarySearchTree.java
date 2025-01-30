package tree;

import utils.TreeNode;

/**
 * Medium
 * <p>
 * You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,3,null,null,2]
 * <p>
 * Output: [3,1,null,null,2]
 * <p>
 * Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.
 * <p>
 * Example 2:
 * <p>
 * Input: root = [3,1,4,null,null,2]
 * <p>
 * Output: [2,1,4,null,null,3]
 * <p>
 * Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 makes the BST valid.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [2, 1000].
 * -2^31 <= Node.val <= 2^31 - 1
 */
public class RecoverBinarySearchTree {

    private TreeNode prev = null;
    private TreeNode first = null;
    private TreeNode second = null;

    public void recoverTree(TreeNode root) {
        evalSwappedNodes(root);
        int temp = first.value;
        first.value = second.value;
        second.value = temp;
    }

    private void evalSwappedNodes(TreeNode curr) {
        if (curr == null) {
            return;
        }
        evalSwappedNodes(curr.left);
        if (prev != null && prev.value > curr.value) {
            if (first == null) {
                first = prev;
            }
            second = curr;
        }
        prev = curr;
        evalSwappedNodes(curr.right);
    }
}
