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

    List<Integer> list = new ArrayList<>();
    private int maxHeight = Integer.MIN_VALUE;

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return list;
        dfs(root, 0);
        return list;
    }

    private void dfs(TreeNode node, int height) {
        if (node != null) {
            if (height > maxHeight) {
                list.add(node.val);
                maxHeight = height;
            }
            dfs(node.right, height + 1);
            dfs(node.left, height + 1);
        }
    }

}
