package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreePostorderTraversalTest {

    @Test
    public void shouldTraversePostorderForMixedTree() {
        var root = TreeNode.create(new Integer[]{1, null, 2, 3});
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(root)).containsExactly(3, 2, 1);
    }

    @Test
    public void shouldReturnEmptyListForEmptyTree() {
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(null)).isEmpty();
    }

    @Test
    public void shouldReturnSingleValueForSingleNode() {
        var root = TreeNode.create(new Integer[]{1});
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(root)).containsExactly(1);
    }

    @Test
    public void shouldTraversePostorderWhenOnlyLeftChildExists() {
        var root = TreeNode.create(new Integer[]{1, 2});
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(root)).containsExactly(2, 1);
    }

    @Test
    public void shouldTraversePostorderWhenOnlyRightChildExists() {
        var root = TreeNode.create(new Integer[]{1, null, 2});
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(root)).containsExactly(2, 1);
    }

    @Test
    public void shouldTraversePostorderForFullTree() {
        var root = TreeNode.create(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(root))
                .containsExactly(4, 5, 2, 6, 7, 3, 1);
    }
}
