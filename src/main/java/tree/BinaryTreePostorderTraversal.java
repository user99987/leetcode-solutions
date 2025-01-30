package tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
        return root == null ? new ArrayList<>() :
                Stream.concat(
                        Stream.concat(
                                postorderTraversal(root.left).stream(),
                                postorderTraversal(root.right).stream()
                        ),
                        Stream.of(root.value)
                ).toList();
    }

}
