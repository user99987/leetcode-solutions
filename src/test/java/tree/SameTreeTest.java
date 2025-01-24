package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeTest {

    @Test
    public void testCase1() {
        boolean actual = new SameTree().isSameTree(
                TreeNode.create(new Integer[]{1, 2, 3}),
                TreeNode.create(new Integer[]{1, 2, 3})
        );
        assertTrue(actual);
    }

    @Test
    public void testCase2() {
        boolean actual = new SameTree().isSameTree(
                TreeNode.create(new Integer[]{1, 2}),
                TreeNode.create(new Integer[]{1, null, 2})
        );
        assertFalse(actual);
    }

    @Test
    public void testCase3() {
        boolean actual = new SameTree().isSameTree(
                TreeNode.create(new Integer[]{1, 2, 1}),
                TreeNode.create(new Integer[]{1, 1, 2})
        );
        assertFalse(actual);
    }
}
