package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;


class ConstructStringFromBinaryTreeTest {

    @Test
    void testCase1() {
        var root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        assertThat(new ConstructStringFromBinaryTree().tree2str(root)).isEqualTo("1(2(4))(3)");
    }

    @Test
    void testCase2() {
        var root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        assertThat(new ConstructStringFromBinaryTree().tree2str(root)).isEqualTo("1(2()(4))(3)");
    }
}
