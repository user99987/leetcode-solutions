package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreePathsTest {

    @Test
    public void shouldFindAllRootToLeafPaths() {
        var root = TreeNode.create(new Integer[]{1, 2, 3, null, 5});
        assertThat(new BinaryTreePaths().binaryTreePaths(root)).containsExactlyInAnyOrder("1->2->5", "1->3");
    }

    @Test
    public void shouldReturnSinglePathForSingleNode() {
        var root = TreeNode.create(new Integer[]{1});
        assertThat(new BinaryTreePaths().binaryTreePaths(root)).containsExactly("1");
    }

    @Test
    public void shouldReturnEmptyListWhenRootIsNull() {
        assertThat(new BinaryTreePaths().binaryTreePaths(null)).isEmpty();
    }

    @Test
    public void shouldReturnSinglePathForSkewedLeftTree() {
        var root = TreeNode.create(new Integer[]{1, 2, null, 3});
        assertThat(new BinaryTreePaths().binaryTreePaths(root)).containsExactly("1->2->3");
    }

    @Test
    public void shouldFormatNegativeValuesCorrectly() {
        var root = TreeNode.create(new Integer[]{-1, -2, -3});
        assertThat(new BinaryTreePaths().binaryTreePaths(root)).containsExactlyInAnyOrder("-1->-2", "-1->-3");
    }

    @Test
    public void shouldFindAllPathsInFullBinaryTree() {
        var root = TreeNode.create(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        assertThat(new BinaryTreePaths().binaryTreePaths(root)).containsExactlyInAnyOrder(
                "1->2->4", "1->2->5", "1->3->6", "1->3->7");
    }
}
