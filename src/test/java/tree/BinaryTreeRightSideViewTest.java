package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreeRightSideViewTest {

    @Test
    public void shouldReturnRightSideViewWithHiddenLeftNode() {
        var root = TreeNode.create(new Integer[]{1, 2, 3, null, 5, null, 4});
        assertThat(new BinaryTreeRightSideView().rightSideView(root)).containsExactly(1, 3, 4);
    }

    @Test
    public void shouldReturnRightSideViewWithOnlyRightChildren() {
        var root = TreeNode.create(new Integer[]{1, null, 3});
        assertThat(new BinaryTreeRightSideView().rightSideView(root)).containsExactly(1, 3);
    }

    @Test
    public void shouldReturnEmptyListForEmptyTree() {
        assertThat(new BinaryTreeRightSideView().rightSideView(null)).isEmpty();
    }

    @Test
    public void shouldReturnSingleNodeForSingleNodeTree() {
        var root = TreeNode.create(new Integer[]{5});
        assertThat(new BinaryTreeRightSideView().rightSideView(root)).containsExactly(5);
    }

    @Test
    public void shouldShowAllNodesForLeftLeaningSkewedTree() {
        var root = TreeNode.create(new Integer[]{1, 2, null, 3, null, 4});
        assertThat(new BinaryTreeRightSideView().rightSideView(root)).containsExactly(1, 2, 3, 4);
    }

    @Test
    public void shouldShowLeftNodeWhenNoRightSiblingExists() {
        var root = TreeNode.create(new Integer[]{1, 2, 3, 4});
        assertThat(new BinaryTreeRightSideView().rightSideView(root)).containsExactly(1, 3, 4);
    }
}
