package popular;


import utils.TreeNode;

/**
 * Medium
 * <p>
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * A valid BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node’s key.
 * The right subtree of a node contains only nodes with keys greater than the node’s key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 * <p>
 * Input: root = [2,1,3]
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: root = [5,1,4,null,null,3,6]
 * <p>
 * Output: false
 * <p>
 * Explanation: The root node’s value is 5 but its right child’s value is 4.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * -2^31 <= Node.val <= 2^31 - 1
 */
public class ValidateBinarySearchTree {

    public static void main(String[] args) throws Exception {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        System.out.println(new ValidateBinarySearchTree().isValidBST(node1));
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, (((long) Integer.MAX_VALUE) + 1), ((long) Integer.MIN_VALUE) - 1);
    }

    private boolean isValidBSTHelper(TreeNode node, long max, long min) {
        if (node == null) {
            return true;
        }
        if (node.val >= max || node.val <= min) {
            return false;
        }
        return isValidBSTHelper(node.left, node.val, min) && isValidBSTHelper(node.right, max, node.val);
    }

}