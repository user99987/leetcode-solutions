package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;


public class FlipEquivalentBinaryTreesTest {

    @Test
    public void testCase1() {
        boolean actual = new FlipEquivalentBinaryTrees().flipEquiv(
                TreeNode.create(new Integer[]{1, 2, 3, 4, 5, 6, null, null, null, 7, 8}),
                TreeNode.create(new Integer[]{1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7})
        );
        assertThat(actual).isTrue();
    }

    @Test
    public void testCase2() {
        boolean actual = new FlipEquivalentBinaryTrees().flipEquiv(
                TreeNode.create(new Integer[]{}),
                TreeNode.create(new Integer[]{})
        );
        assertThat(actual).isTrue();
    }

    @Test
    public void testCase3() {
        boolean actual = new FlipEquivalentBinaryTrees().flipEquiv(
                TreeNode.create(new Integer[]{}),
                TreeNode.create(new Integer[]{1})
        );
        assertThat(actual).isFalse();
    }
}
