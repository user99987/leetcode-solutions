package popular;

import utils.TreeNode;

/**
 * Hard
 * <p>
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
 * <p>
 * The path sum of a path is the sum of the node’s values in the path.
 * <p>
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,2,3]
 * <p>
 * Output: 6
 * <p>
 * Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
 * <p>
 * Example 2:
 * <p>
 * Input: root = [-10,9,20,null,null,15,7]
 * <p>
 * Output: 42
 * <p>
 * Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 3 * 104].
 * -1000 <= Node.val <= 1000
 */
public class BinaryTreeMaximumPathSum {

    int maxVal = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxVal;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        int sum = root.val + left + right;
        maxVal = Math.max(maxVal, sum);
        return root.val + Math.max(left, right);
    }

}
