package tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Easy
 * <p>
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 * <p>
 * A leaf is a node with no children.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: root = [1,2,3,null,5]
 * <p>
 * Output: ["1->2->5","1->3"]
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1]
 * <p>
 * Output: ["1"]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 100].
 * -100 <= Node.val <= 100
 */
public class BinaryTreePaths {

    public static void main(String[] args) throws Exception {
        TreeNode root = new utils.TreeNode(1);
        root.left = new utils.TreeNode(2);
        root.right = new utils.TreeNode(3);
        root.left.right = new utils.TreeNode(5);

        System.out.println(new BinaryTreePaths().binaryTreePaths(root));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        new BinaryTreePaths().inorder(root, result, "");
        return result;
    }

    private void inorder(TreeNode node, List<String> list, String path) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                list.add(path + node.val);
            } else {
                inorder(node.left, list, path + node.val + "->");
                inorder(node.right, list, path + node.val + "->");
            }
        }
    }

}
