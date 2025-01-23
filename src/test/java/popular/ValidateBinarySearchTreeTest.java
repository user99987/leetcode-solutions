package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateBinarySearchTreeTest {

    @Test
    public void testCase1() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertTrue(new ValidateBinarySearchTree().isValidBST(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        assertFalse(new ValidateBinarySearchTree().isValidBST(root));
    }
}
