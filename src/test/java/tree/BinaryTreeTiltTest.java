package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeTiltTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals(1, new BinaryTreeTilt().findTilt(root));
    }

    @Test
    void testCase2() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(3), new TreeNode(5)),
                new TreeNode(9, null, new TreeNode(7)));
        assertEquals(15, new BinaryTreeTilt().findTilt(root));
    }

    @Test
    void testCase3() {
        TreeNode root = new TreeNode(21,
                new TreeNode(7,
                        new TreeNode(1, new TreeNode(3), new TreeNode(3)),
                        new TreeNode(1)),
                new TreeNode(14,
                        new TreeNode(2),
                        new TreeNode(2)));
        assertEquals(9, new BinaryTreeTilt().findTilt(root));
    }
}
