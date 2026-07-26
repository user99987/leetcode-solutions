package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class ConstructStringFromBinaryTreeTest {

    @Test
    public void shouldOmitEmptyParensForLeftOnlyChild() {
        var root = TreeNode.create(new Integer[]{1, 2, 3, 4});
        assertThat(new ConstructStringFromBinaryTree().tree2str(root)).isEqualTo("1(2(4))(3)");
    }

    @Test
    public void shouldIncludeEmptyLeftParensWhenLeftMissingButRightGrandchildExists() {
        var root = TreeNode.create(new Integer[]{1, 2, 3, null, 4});
        assertThat(new ConstructStringFromBinaryTree().tree2str(root)).isEqualTo("1(2()(4))(3)");
    }

    @Test
    public void shouldReturnEmptyStringWhenRootIsNull() {
        assertThat(new ConstructStringFromBinaryTree().tree2str(null)).isEmpty();
    }

    @Test
    public void shouldReturnJustValueForSingleNode() {
        var root = TreeNode.create(new Integer[]{5});
        assertThat(new ConstructStringFromBinaryTree().tree2str(root)).isEqualTo("5");
    }

    @Test
    public void shouldIncludeEmptyLeftParensWhenOnlyRightChildExists() {
        var root = TreeNode.create(new Integer[]{1, null, 2});
        assertThat(new ConstructStringFromBinaryTree().tree2str(root)).isEqualTo("1()(2)");
    }

    @Test
    public void shouldFormatNegativeValuesCorrectly() {
        var root = TreeNode.create(new Integer[]{-1, -2});
        assertThat(new ConstructStringFromBinaryTree().tree2str(root)).isEqualTo("-1(-2)");
    }
}
