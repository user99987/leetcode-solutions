package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindBottomLeftTreeValueTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertEquals(1, new FindBottomLeftTreeValue().findBottomLeftValue(root));
    }

    @Test
    void testCase2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, new TreeNode(5, new TreeNode(7), null), new TreeNode(6)));
        assertEquals(7, new FindBottomLeftTreeValue().findBottomLeftValue(root));
    }
}
