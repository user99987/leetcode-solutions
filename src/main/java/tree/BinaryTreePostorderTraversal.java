package tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Easy
 * <p>
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,null,2,3]
 * <p>
 * Output: [3,2,1]
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
 * Output: [2,1]
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> res = postorderTraversal(root.left);
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);
        return res;
    }

}
