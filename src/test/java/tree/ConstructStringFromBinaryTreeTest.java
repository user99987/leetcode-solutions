package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructStringFromBinaryTreeTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        assertEquals("1(2(4))(3)", new ConstructStringFromBinaryTree().tree2str(root));
    }

    @Test
    void testCase2() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        assertEquals("1(2()(4))(3)", new ConstructStringFromBinaryTree().tree2str(root));
    }
}
