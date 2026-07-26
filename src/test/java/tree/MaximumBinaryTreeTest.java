package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumBinaryTreeTest {

    @Test
    public void shouldBuildMaximumBinaryTreeFromArray() {
        var result = new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
        assertThat(TreeNode.toList(result)).containsExactly(6, 3, 5, 2, 0, 1);
    }

    @Test
    public void shouldBuildTreeWithNullLeftAtRoot() {
        var result = new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1});
        assertThat(result.value).isEqualTo(3);
        assertThat(result.left).isNull();
        assertThat(result.right.value).isEqualTo(2);
        assertThat(result.right.right.value).isEqualTo(1);
    }

    @Test
    public void shouldReturnSingleNodeForSingleElementArray() {
        var result = new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{5});
        assertThat(result.value).isEqualTo(5);
        assertThat(result.left).isNull();
        assertThat(result.right).isNull();
    }

    @Test
    public void shouldBuildRightSkewedTreeForAscendingArray() {
        var result = new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{1, 2, 3});
        assertThat(result.value).isEqualTo(3);
        assertThat(result.left.value).isEqualTo(2);
        assertThat(result.left.left.value).isEqualTo(1);
        assertThat(result.right).isNull();
    }

    @Test
    public void shouldBuildLeftSkewedChildrenForDescendingArray() {
        var result = new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1});
        assertThat(result.value).isEqualTo(3);
        assertThat(result.right.value).isEqualTo(2);
        assertThat(result.right.right.value).isEqualTo(1);
    }
}
