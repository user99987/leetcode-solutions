package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    void testCase1() {
        TreeNode node = new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        assertThat(node).isNotNull();
        assertThat(node.value).isEqualTo(0);
        assertThat(node.left).isNotNull();
        assertThat(node.left.value).isEqualTo(-10);
        assertThat(node.left.left).isNull();
        assertThat(node.left.right).isNotNull();
        assertThat(node.left.right.value).isEqualTo(-3);
        assertThat(node.right).isNotNull();
        assertThat(node.right.value).isEqualTo(5);
        assertThat(node.right.right).isNotNull();
        assertThat(node.right.right.value).isEqualTo(9);
        assertThat(node.right.left).isNull();
    }

    @Test
    void testCase2() {
        TreeNode node = new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(new int[]{1, 3});
        assertThat(node).isNotNull();
        assertThat(node.value).isEqualTo(1);
        assertThat(node.left).isNull();
        assertThat(node.right).isNotNull();
        assertThat(node.right.value).isEqualTo(3);
    }

}
