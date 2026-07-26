package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeLevelOrderTraversalTest {

    @Test
    void shouldGroupNodesByLevelForBalancedTree() {
        var root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        assertThat(new BinaryTreeLevelOrderTraversal().levelOrder(root))
                .containsExactly(List.of(3), List.of(9, 20), List.of(15, 7));
    }

    @Test
    void shouldReturnSingleLevelForSingleNodeTree() {
        var root = new TreeNode(1);
        assertThat(new BinaryTreeLevelOrderTraversal().levelOrder(root)).containsExactly(List.of(1));
    }

    @Test
    void shouldReturnEmptyListForNullRoot() {
        assertThat(new BinaryTreeLevelOrderTraversal().levelOrder(null)).isEmpty();
    }

}
