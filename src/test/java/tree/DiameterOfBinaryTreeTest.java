package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class DiameterOfBinaryTreeTest {

    @Test
    public void shouldCalculateDiameterThroughRoot() {
        var root = TreeNode.create(new Integer[]{1, 2, 3, 4, 5});
        assertThat(new DiameterOfBinaryTree().diameterOfBinaryTree(root)).isEqualTo(3);
    }

    @Test
    public void shouldCalculateDiameterForTwoNodeTree() {
        var root = TreeNode.create(new Integer[]{1, 2});
        assertThat(new DiameterOfBinaryTree().diameterOfBinaryTree(root)).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroDiameterForSingleNode() {
        var root = TreeNode.create(new Integer[]{1});
        assertThat(new DiameterOfBinaryTree().diameterOfBinaryTree(root)).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroDiameterWhenRootIsNull() {
        assertThat(new DiameterOfBinaryTree().diameterOfBinaryTree(null)).isEqualTo(0);
    }

    @Test
    public void shouldCalculateDiameterEqualToDepthMinusOneForSkewedTree() {
        var root = TreeNode.create(new Integer[]{1, 2, null, 3, null, 4});
        assertThat(new DiameterOfBinaryTree().diameterOfBinaryTree(root)).isEqualTo(3);
    }

    @Test
    public void shouldDetectDiameterNotPassingThroughRoot() {
        // Longest path is entirely within left subtree, not through root
        var root = TreeNode.create(new Integer[]{1, 2, null, 3, 4, null, null, 5});
        assertThat(new DiameterOfBinaryTree().diameterOfBinaryTree(root)).isEqualTo(3);
    }
}
