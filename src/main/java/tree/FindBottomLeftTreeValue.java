package tree;

import utils.TreeNode;

/**
 * 30/08/2017. Given a binary tree, find the leftmost value in the
 * Medium
 * <p>
 * Given the root of a binary tree, return the leftmost value in the last row of the tree.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [2,1,3]
 * <p>
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1,2,3,4,null,5,6,null,null,7]
 * <p>
 * Output: 7
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * -2^31 <= Node.val <= 2^31 - 1
 */
public class FindBottomLeftTreeValue {

    private int maxDepth = 0, leftMostValue;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 1);
        return leftMostValue;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) return;
        if (depth > maxDepth) {
            maxDepth = depth;
            leftMostValue = node.value;
        }
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}
