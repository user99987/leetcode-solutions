package popular;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Easy
 * <p>
 * Given the root of a binary tree, return the inorder traversal of its nodes’ values.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,null,2,3]
 * <p>
 * Output: [1,3,2]
 * <p>
 * Example 2:
 * <p>
 * Input: root = []
 * <p>
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: root = [1]
 * <p>
 * Output: [1]
 * <p>
 * Example 4:
 * <p>
 * Input: root = [1,2]
 * <p>
 * Output: [2,1]
 * <p>
 * Example 5:
 * <p>
 * Input: root = [1,null,2]
 * <p>
 * Output: [1,2]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.left.left = new TreeNode(9);
        root.left.left.right = new TreeNode(10);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
        List<Integer> result = new BinaryTreeInorderTraversal().inorderTraversal(root);
        System.out.println(result);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            inorder.add(curr.val);
            curr = curr.right;
        }
        return inorder;
    }
}