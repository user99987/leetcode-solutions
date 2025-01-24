package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubtreeOfAnotherTreeTest {

    @Test
    public void testCase1() {
        boolean actual = new SubtreeOfAnotherTree().isSubtree(
                TreeNode.create(new Integer[]{3, 4, 5, 1, 2}),
                TreeNode.create(new Integer[]{4, 1, 2})
        );
        assertTrue(actual);
    }

    @Test
    public void testCase2() {
        boolean actual = new SubtreeOfAnotherTree().isSubtree(
                TreeNode.create(new Integer[]{3, 4, 5, 1, 2, null, null, null, null, 0}),
                TreeNode.create(new Integer[]{4, 1, 2})
        );
        assertFalse(actual);
    }
}
