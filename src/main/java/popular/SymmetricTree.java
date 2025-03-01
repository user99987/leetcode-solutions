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

    public boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        return left == null || right == null
                ? left == right
                : left.value == right.value && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
