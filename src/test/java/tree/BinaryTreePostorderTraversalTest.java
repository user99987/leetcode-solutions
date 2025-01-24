package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreePostorderTraversalTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> expected = List.of(3, 2, 1);
        assertEquals(expected, new BinaryTreePostorderTraversal().postorderTraversal(root));
    }

    @Test
    void testCase2() {
        TreeNode root = null;
        List<Integer> expected = List.of();
        assertEquals(expected, new BinaryTreePostorderTraversal().postorderTraversal(root));
    }

    @Test
    void testCase3() {
        TreeNode root = new TreeNode(1);
        List<Integer> expected = List.of(1);
        assertEquals(expected, new BinaryTreePostorderTraversal().postorderTraversal(root));
    }

    @Test
    void testCase4() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        List<Integer> expected = List.of(2, 1);
        assertEquals(expected, new BinaryTreePostorderTraversal().postorderTraversal(root));
    }

    @Test
    void testCase5() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        List<Integer> expected = List.of(2, 1);
        assertEquals(expected, new BinaryTreePostorderTraversal().postorderTraversal(root));
    }
}
