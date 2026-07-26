package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeInorderTraversalTest {

    @Test
    void shouldTraverseTreeWithRightChildHavingLeftGrandchild() {
        var root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        assertThat(new BinaryTreeInorderTraversal().inorderTraversal(root)).containsExactly(1, 3, 2);
    }

    @Test
    void shouldReturnEmptyListForNullRoot() {
        assertThat(new BinaryTreeInorderTraversal().inorderTraversal(null)).isEmpty();
    }

    @Test
    void shouldReturnSingleValueForSingleNodeTree() {
        var root = new TreeNode(1);
        assertThat(new BinaryTreeInorderTraversal().inorderTraversal(root)).containsExactly(1);
    }

    @Test
    void shouldTraverseTreeWithOnlyLeftChild() {
        var root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertThat(new BinaryTreeInorderTraversal().inorderTraversal(root)).containsExactly(2, 1);
    }

    @Test
    void shouldTraverseTreeWithOnlyRightChild() {
        var root = new TreeNode(1);
        root.right = new TreeNode(2);
        assertThat(new BinaryTreeInorderTraversal().inorderTraversal(root)).containsExactly(1, 2);
    }

}
