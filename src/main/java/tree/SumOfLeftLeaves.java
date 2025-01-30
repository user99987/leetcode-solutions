package tree;

import utils.TreeNode;

import java.util.stream.IntStream;

/**
 * Easy
 * <p>
 * Given the root of a binary tree, return the sum of all left leaves.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * <p>
 * Output: 24
 * <p>
 * Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 1000].
 * -1000 <= Node.val <= 1000
 */
public class SumOfLeftLeaves {


    public int sumOfLeftLeaves(TreeNode root) {
        return root == null ? 0 : IntStream.of(
                        isLeaf(root.left) ? root.left.value : sumOfLeftLeaves(root.left),
                        sumOfLeftLeaves(root.right))
                .sum();
    }

    private boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }

}
