package tree;

import utils.TreeNode;

/**
 * Easy
 * <p>
 * Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it.
 * <p>
 * Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: root = [1,2,3,4]
 * <p>
 * Output: "1(2(4))(3)"
 * <p>
 * Explanation: Originally, it needs to be "1(2(4)())(3()())", but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"
 * <p>
 * Example 2:
 * <p>
 * <p>
 * <p>
 * Input: root = [1,2,3,null,4]
 * <p>
 * Output: "1(2()(4))(3)"
 * <p>
 * Explanation: Almost the same as the first example, except we cannot omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * -1000 <= Node.val <= 1000
 */
public class ConstructStringFromBinaryTree {

    public String tree2str(TreeNode root) {
        if (root == null) return "";
        var result = new StringBuilder();
        build(root, result);
        return result.toString();
    }

    private void build(TreeNode node, StringBuilder result) {
        result.append(node.value);
        if (node.left == null && node.right == null) return;
        result.append('(');
        if (node.left != null) {
            build(node.left, result);
        }
        result.append(')');
        if (node.right != null) {
            result.append('(');
            build(node.right, result);
            result.append(')');
        }
    }
}
