package tree;

import utils.TreeNode;

/**
 * Easy
 * <p>
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
 * <p>
 * A subtree of a binary tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the root tree is in the range [1, 2000].
 * The number of nodes in the subRoot tree is in the range [1, 1000].
 * -10^4 <= root.val <= 10^4
 * -10^4 <= subRoot.val <= 10^4
 */
public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (traverse(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean traverse(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot != null) {
            return false;
        }
        if (root != null && subRoot == null) {
            return false;
        }
        if (root == null) {
            return true;
        }
        if (root.value != subRoot.value) {
            return false;
        }
        return traverse(root.left, subRoot.left) && traverse(root.right, subRoot.right);
    }
}
