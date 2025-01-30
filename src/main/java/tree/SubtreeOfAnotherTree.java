package tree;

import utils.TreeNode;

import java.util.stream.Stream;

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
        return root != null && (isSameTree(root, subRoot) ||
                Stream.of(root.left, root.right).anyMatch(node -> isSubtree(node, subRoot)));
    }

    private boolean isSameTree(TreeNode root, TreeNode subRoot) {
        return root == subRoot || (root != null && subRoot != null && root.value == subRoot.value &&
                isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right));
    }
}
