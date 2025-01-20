package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ConstructBinarySearchTreeFromPreorderTraversalTest {

    @Test
    void testCase1() {
        TreeNode node = new ConstructBinarySearchTreeFromPreorderTraversal().bstFromPreorder(
                new int[]{8, 5, 1, 7, 10, 12});
        assertThat(node).isNotNull();
        assertThat(node.val).isEqualTo(8);
        assertThat(node.left).isNotNull();
        assertThat(node.left.val).isEqualTo(5);
        assertThat(node.left.left).isNotNull();
        assertThat(node.left.left.val).isEqualTo(1);
        assertThat(node.left.right).isNotNull();
        assertThat(node.left.right.val).isEqualTo(7);
        assertThat(node.right).isNotNull();
        assertThat(node.right.val).isEqualTo(10);
        assertThat(node.right.right).isNotNull();
        assertThat(node.right.right.val).isEqualTo(12);
        assertThat(node.right.left).isNull();
    }

    @Test
    void testCase2() {
        TreeNode node = new ConstructBinarySearchTreeFromPreorderTraversal().bstFromPreorder(
                new int[]{1, 3});
        assertThat(node).isNotNull();
        assertThat(node.val).isEqualTo(1);
        assertThat(node.left).isNull();
        assertThat(node.right).isNotNull();
        assertThat(node.right.val).isEqualTo(3);
    }
}
