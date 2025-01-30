package tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        traverse(root, "", result);
        return result;
    }

    private void traverse(TreeNode node, String path, List<String> result) {
        if (node == null) return;
        String newPath = path.isEmpty() ? String.valueOf(node.value) : path + "->" + node.value;
        if (node.left == null && node.right == null) {
            result.add(newPath);
        } else {
            Stream.of(node.left, node.right).forEach(child -> traverse(child, newPath, result));
        }
    }

}
