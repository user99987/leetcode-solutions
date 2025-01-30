package tree;

import utils.TreeNode;

/**
 * Medium
 * <p>
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * <p>
 * According to the definition of LCA on Wikipedia: "The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself)."
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * <p>
 * Output: 3
 * <p>
 * Explanation: The LCA of nodes 5 and 1 is 3.
 * <p>
 * Example 2:
 * <p>
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * <p>
 * Output: 5
 * <p>
 * Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
 * <p>
 * Example 3:
 * <p>
 * Input: root = [1,2], p = 1, q = 2
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [2, 105].
 * -109 <= Node.val <= 109
 * All Node.val are unique.
 * p != q
 * p and q will exist in the tree.
 */
public class LowestCommonAncestorBST {

    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (p.value == root.value || q.value == root.value) return root;
        else if ((p.value < root.value && q.value > root.value) || (q.value < root.value && p.value > root.value))
            return root;
        else if (p.value < root.value) return lowestCommonAncestor(root.left, p, q);
        else return lowestCommonAncestor(root.right, p, q);
    }

}
