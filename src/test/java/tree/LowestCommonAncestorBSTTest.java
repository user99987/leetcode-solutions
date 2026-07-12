package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;

import java.util.LinkedList;


public class LowestCommonAncestorBSTTest {

    private TreeNode findNode(TreeNode root, int val) {
        if (root == null) return null;
        var queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            var current = queue.poll();
            if (current.value == val) return current;
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        return null;
    }

    @Test
    public void testCase1() {
        var root = TreeNode.create(new Integer[]{3, 5, 1, 6, 2, 0, 8, 7, 4});
        TreeNode p = findNode(root, 5);
        TreeNode q = findNode(root, 1);
        var actual = new LowestCommonAncestorBST().lowestCommonAncestor(root, p, q);
        assertThat(actual).isNotNull();
        assertThat(actual.value).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        var root = TreeNode.create(new Integer[]{1, 2});
        TreeNode p = findNode(root, 1);
        TreeNode q = findNode(root, 2);
        var actual = new LowestCommonAncestorBST().lowestCommonAncestor(root, p, q);
        assertThat(actual).isNotNull();
        assertThat(actual.value).isEqualTo(1);
    }
}
