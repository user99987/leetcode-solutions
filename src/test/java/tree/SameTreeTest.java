package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;


public class SameTreeTest {

    @Test
    public void testCase1() {
        boolean actual = new SameTree().isSameTree(
                TreeNode.create(new Integer[]{1, 2, 3}),
                TreeNode.create(new Integer[]{1, 2, 3})
        );
        assertThat(actual).isTrue();
    }

    @Test
    public void testCase2() {
        boolean actual = new SameTree().isSameTree(
                TreeNode.create(new Integer[]{1, 2}),
                TreeNode.create(new Integer[]{1, null, 2})
        );
        assertThat(actual).isFalse();
    }

    @Test
    public void testCase3() {
        boolean actual = new SameTree().isSameTree(
                TreeNode.create(new Integer[]{1, 2, 1}),
                TreeNode.create(new Integer[]{1, 1, 2})
        );
        assertThat(actual).isFalse();
    }
}
