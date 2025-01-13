package popular;

import utils.TreeNode;

/**
 * Medium
 * <p>
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * <p>
 * Output: [3,9,20,null,null,15,7]
 * <p>
 * Example 2:
 * <p>
 * Input: preorder = [-1], inorder = [-1]
 * <p>
 * Output: [-1]
 * <p>
 * Constraints:
 * <p>
 * 1 <= preorder.length <= 3000
 * inorder.length == preorder.length
 * -3000 <= preorder[i], inorder[i] <= 3000
 * preorder and inorder consist of unique values.
 * Each value of inorder also appears in preorder.
 * preorder is guaranteed to be the preorder traversal of the tree.
 * inorder is guaranteed to be the inorder traversal of the tree.
 */
public class ConstructBinarySearchTreeFromPreorderTraversal {

    public static void main(String[] args) throws Exception {
        TreeNode node = new ConstructBinarySearchTreeFromPreorderTraversal().buildTree(
                new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        printResult(node, "root", null);
    }

    private static void printResult(TreeNode node, String order, Integer root) {
        if (node == null) return;
        System.out.println("root: " + root + " " + order + ":" + node.val);
        printResult(node.left, "left", node.val);
        printResult(node.right, "right", node.val);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null; // Check for empty arrays
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1); // Construct binary tree
    }

    // Recursive helper method to construct binary tree
    private TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) return null; // Base case

        int rootValue = preorder[preStart]; // Root node value
        TreeNode root = new TreeNode(rootValue); // Create root node

        // Find root node's position in inorder array
        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }

        // Recursively build left and right subtrees
        root.left = build(preorder, inorder, preStart + 1, preStart + rootIndex - inStart, inStart, rootIndex - 1);
        root.right = build(preorder, inorder, preStart + rootIndex - inStart + 1, preEnd, rootIndex + 1, inEnd);

        return root; // Return root node
    }
}
