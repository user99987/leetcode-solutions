package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;

import java.util.List;


class BinaryTreePostorderTraversalTest {

    @Test
    void testCase1() {
        var root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        var expected = List.of(3, 2, 1);
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(root)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        TreeNode root = null;
        var expected = List.of();
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(root)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        var root = new TreeNode(1);
        var expected = List.of(1);
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(root)).isEqualTo(expected);
    }

    @Test
    void testCase4() {
        var root = new TreeNode(1, new TreeNode(2), null);
        var expected = List.of(2, 1);
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(root)).isEqualTo(expected);
    }

    @Test
    void testCase5() {
        var root = new TreeNode(1, null, new TreeNode(2));
        var expected = List.of(2, 1);
        assertThat(new BinaryTreePostorderTraversal().postorderTraversal(root)).isEqualTo(expected);
    }
}
