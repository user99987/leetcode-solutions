package tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Medium
 * <p>
 * Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,2,3,null,5,null,4]
 * <p>
 * Output: [1,3,4]
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1,null,3]
 * <p>
 * Output: [1,3]
 * <p>
 * Example 3:
 * <p>
 * Input: root = []
 * <p>
 * Output: []
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */
public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, 0, new int[]{-1}, result);
        return result;
    }

    private void dfs(TreeNode node, int depth, int[] maxDepth, List<Integer> result) {
        if (node == null) return;
        if (depth > maxDepth[0]) {
            result.add(node.value);
            maxDepth[0] = depth;
        }
        dfs(node.right, depth + 1, maxDepth, result);
        dfs(node.left, depth + 1, maxDepth, result);
    }

}
