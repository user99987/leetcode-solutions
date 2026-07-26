package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class SumOfLeftLeavesTest {

    @Test
    public void shouldSumAllLeftLeaves() {
        var root = TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertThat(new SumOfLeftLeaves().sumOfLeftLeaves(root)).isEqualTo(24);
    }

    @Test
    public void shouldReturnZeroWhenNoLeftLeavesExist() {
        var root = TreeNode.create(new Integer[]{1});
        assertThat(new SumOfLeftLeaves().sumOfLeftLeaves(root)).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroWhenRootIsNull() {
        assertThat(new SumOfLeftLeaves().sumOfLeftLeaves(null)).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroWhenOnlyRightChildrenExist() {
        var root = TreeNode.create(new Integer[]{1, null, 2, null, 3});
        assertThat(new SumOfLeftLeaves().sumOfLeftLeaves(root)).isEqualTo(0);
    }

    @Test
    public void shouldNotCountLeftChildWhenItIsNotLeaf() {
        var root = TreeNode.create(new Integer[]{1, 2, null, 3});
        assertThat(new SumOfLeftLeaves().sumOfLeftLeaves(root)).isEqualTo(3);
    }

    @Test
    public void shouldSumNegativeValuesCorrectly() {
        var root = TreeNode.create(new Integer[]{1, -2, 3});
        assertThat(new SumOfLeftLeaves().sumOfLeftLeaves(root)).isEqualTo(-2);
    }
}
