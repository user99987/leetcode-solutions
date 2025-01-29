package popular;

import utils.TreeNode;

/**
 * Medium
 * <p>
 * Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree), construct the tree and return its root.
 * <p>
 * It is guaranteed that there is always possible to find a binary search tree with the given requirements for the given test cases.
 * <p>
 * A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less than Node.val, and any descendant of Node.right has a value strictly greater than Node.val.
 * <p>
 * A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then traverses Node.right.
 * <p>
 * Example 1:
 * <p>
 * Input: preorder = [8,5,1,7,10,12]
 * <p>
 * Output: [8,5,10,1,7,null,12]
 * <p>
 * Example 2:
 * <p>
 * Input: preorder = [1,3]
 * <p>
 * Output: [1,null,3]
 * <p>
 * Constraints:
 * <p>
 * 1 <= preorder.length <= 100
 * 1 <= preorder[i] <= 1000
 * All the values of preorder are unique.
 */
public class ConstructBinarySearchTreeFromPreorderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, new int[]{0}, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int[] index, int bound) {
        if (index[0] == preorder.length || preorder[index[0]] > bound) return null;
        TreeNode node = new TreeNode(preorder[index[0]++]);
        node.left = build(preorder, index, node.val);
        node.right = build(preorder, index, bound);
        return node;
    }
}
