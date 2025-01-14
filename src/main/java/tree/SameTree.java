package tree;

import utils.TreeNode;

/**
 * Easy
 * <p>
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * <p>
 * Example 1:
 * <p>
 * Input: p = [1,2,3], q = [1,2,3]
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: p = [1,2], q = [1,null,2]
 * <p>
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: p = [1,2,1], q = [1,1,2]
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in both trees is in the range [0, 100].
 * -104 <= Node.val <= 104
 */
public class SameTree {

    public static void main(String[] args) throws Exception {
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        node2.right = new TreeNode(2);
        System.out.println(new SameTree().isSameTree(node1, node2));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == null && q == null;
        }
        boolean b1 = isSameTree(p.left, q.left);
        boolean b2 = isSameTree(p.right, q.right);
        return p.val == q.val && b1 && b2;
    }
}
