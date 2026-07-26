package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeMaximumPathSumTest {

    @Test
    void shouldFindMaxPathSumForSimpleThreeNodeTree() {
        var root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        assertThat(new BinaryTreeMaximumPathSum().maxPathSum(root)).isEqualTo(6);
    }

    @Test
    void shouldFindMaxPathSumIgnoringNegativeRoot() {
        var root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);

        assertThat(new BinaryTreeMaximumPathSum().maxPathSum(root)).isEqualTo(42);
    }
}
