package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void testCase1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        assertEquals(2, new MaximumDepthOfBinaryTree().maxDepth(root));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new MaximumDepthOfBinaryTree().maxDepth(null));
    }

    @Test
    public void testCase4() {
        TreeNode root = new TreeNode(0);
        assertEquals(1, new MaximumDepthOfBinaryTree().maxDepth(root));
    }
}

