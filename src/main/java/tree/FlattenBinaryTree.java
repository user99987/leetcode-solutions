package tree;

import utils.TreeNode;

/**
 * Medium
 * <p>
 * Given the root of a binary tree, flatten the tree into a “linked list”:
 * <p>
 * The “linked list” should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
 * The “linked list” should be in the same order as a pre-order traversal of the binary tree.
 * Example 1:
 * <p>
 * Input: root = [1,2,5,3,4,null,6]
 * <p>
 * Output: [1,null,2,null,3,null,4,null,5,null,6]
 * <p>
 * Example 2:
 * <p>
 * Input: root = []
 * <p>
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: root = [0]
 * <p>
 * Output: [0]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 2000].
 * -100 <= Node.val <= 100
 */
public class FlattenBinaryTree {

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        new FlattenBinaryTree().flatten(root);
        System.out.println(root.val);
        System.out.println(root.right.val);
        System.out.println(root.right.right.val);
        System.out.println(root.right.right.right.val);
        System.out.println(root.right.right.right.right.val);
        System.out.println(root.right.right.right.right.right.val);
    }

    public void flatten(TreeNode root) {
        if (root == null) return; // Check for empty tree
        flattenTree(root); // Flatten the tree
    }

    // Recursive helper method to flatten the tree
    private void flattenTree(TreeNode node) {
        if (node == null) return;

        // Flatten left subtree
        flattenTree(node.left);

        // Flatten right subtree
        flattenTree(node.right);

        // Save right subtree
        TreeNode rightSubtree = node.right;

        // Attach left subtree to the right of the current node
        node.right = node.left;

        // Set left child to null
        node.left = null;

        // Move to the rightmost node of the flattened left subtree
        TreeNode current = node;
        while (current.right != null) {
            current = current.right;
        }

        // Attach the saved right subtree to the right of the rightmost node
        current.right = rightSubtree;
    }

}
