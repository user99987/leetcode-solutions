package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlipEquivalentBinaryTreesTest {

    @Test
    public void testCase1() {
        boolean actual = new FlipEquivalentBinaryTrees().flipEquiv(
                TreeNode.create(new Integer[]{1, 2, 3, 4, 5, 6, null, null, null, 7, 8}),
                TreeNode.create(new Integer[]{1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7})
        );
        assertTrue(actual);
    }

    @Test
    public void testCase2() {
        boolean actual = new FlipEquivalentBinaryTrees().flipEquiv(
                TreeNode.create(new Integer[]{}),
                TreeNode.create(new Integer[]{})
        );
        assertTrue(actual);
    }

    @Test
    public void testCase3() {
        boolean actual = new FlipEquivalentBinaryTrees().flipEquiv(
                TreeNode.create(new Integer[]{}),
                TreeNode.create(new Integer[]{1})
        );
        assertFalse(actual);
    }
}
