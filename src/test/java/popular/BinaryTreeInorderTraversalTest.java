package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeInorderTraversalTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        assertTrue(new BinaryTreeInorderTraversal().inorderTraversal(root).containsAll(List.of(1, 3, 2)));
    }

    @Test
    void testCase2() {
        assertTrue(new BinaryTreeInorderTraversal().inorderTraversal(null).isEmpty());
    }

    @Test
    void testCase3() {
        TreeNode root = new TreeNode(1);
        assertTrue(new BinaryTreeInorderTraversal().inorderTraversal(root).contains(1));
    }

    @Test
    void testCase4() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertTrue(new BinaryTreeInorderTraversal().inorderTraversal(root).containsAll(List.of(2, 1)));
    }

    @Test
    void testCase5() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        assertTrue(new BinaryTreeInorderTraversal().inorderTraversal(root).containsAll(List.of(1, 2)));
    }

}
