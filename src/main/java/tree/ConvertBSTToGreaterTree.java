package tree;

import utils.TreeNode;

/**
 * Medium
 * <p>
 * Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.
 * <p>
 * As a reminder, a binary search tree is a tree that satisfies these constraints:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node’s key.
 * The right subtree of a node contains only nodes with keys greater than the node’s key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 * <p>
 * Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
 * <p>
 * Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
 * <p>
 * Example 2:
 * <p>
 * Input: root = [0,null,1]
 * <p>
 * Output: [1,null,1]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 104].
 * -104 <= Node.val <= 104
 * All the values in the tree are unique.
 * root is guaranteed to be a valid binary search tree.
 */
public class ConvertBSTToGreaterTree {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
        node.right = new TreeNode(6);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(7);
        node.right.right.right = new TreeNode(8);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(0);
        node.left.right = new TreeNode(2);
        node.left.right.right = new TreeNode(3);
        TreeNode result = new ConvertBSTToGreaterTree().convertBST(node);
        System.out.println(result.val);
        System.out.println(result.right.val);
        System.out.println(result.right.left.val);
        System.out.println(result.right.right.val);
        System.out.println(result.right.right.right.val);
        System.out.println(result.left.val);
        System.out.println(result.left.left.val);
        System.out.println(result.left.right.val);
        System.out.println(result.left.right.right.val);
    }

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            postOrder(root, 0);
        }
        return root;
    }

    private int postOrder(TreeNode node, int val) {
        int newVal = 0;
        if (node.right != null) {
            newVal += postOrder(node.right, val);
        }
        newVal += newVal == 0 ? val + node.val : node.val;
        node.val = newVal;
        if (node.left != null) {
            newVal = postOrder(node.left, newVal);
        }
        return newVal;
    }
}
