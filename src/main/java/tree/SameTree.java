package tree;

import utils.TreeNode;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * Easy
 * <p>
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * <p>
 * Example 1:
 * <p>
 * Input: p = [1,2,3], q = [1,2,3]
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: p = [1,2], q = [1,null,2]
 * <p>
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: p = [1,2,1], q = [1,1,2]
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in both trees is in the range [0, 100].
 * -10^4 <= Node.val <= 10^4
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return Stream.of(p, q)
                .allMatch(Objects::isNull) ||
                (p != null && q != null && p.value == q.value &&
                        isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}
