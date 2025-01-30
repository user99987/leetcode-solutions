package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LowestCommonAncestorBSTTest {

    private TreeNode findNode(TreeNode root, int val) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.value == val) return current;
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        return null;
    }

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.create(new Integer[]{3, 5, 1, 6, 2, 0, 8, 7, 4});
        TreeNode p = findNode(root, 5);
        TreeNode q = findNode(root, 1);
        TreeNode actual = new LowestCommonAncestorBST().lowestCommonAncestor(root, p, q);
        assertNotNull(actual);
        assertEquals(3, actual.value);
    }

    @Test
    public void testCase2() {
        TreeNode root = TreeNode.create(new Integer[]{1, 2});
        TreeNode p = findNode(root, 1);
        TreeNode q = findNode(root, 2);
        TreeNode actual = new LowestCommonAncestorBST().lowestCommonAncestor(root, p, q);
        assertNotNull(actual);
        assertEquals(1, actual.value);
    }
}
