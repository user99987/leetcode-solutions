package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;


public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void testCase1() {
        var root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        assertThat(new MaximumDepthOfBinaryTree().maxDepth(root)).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        var root = new TreeNode(1, null, new TreeNode(2));
        assertThat(new MaximumDepthOfBinaryTree().maxDepth(root)).isEqualTo(2);
    }

    @Test
    public void testCase3() {
        assertThat(new MaximumDepthOfBinaryTree().maxDepth(null)).isEqualTo(0);
    }

    @Test
    public void testCase4() {
        var root = new TreeNode(0);
        assertThat(new MaximumDepthOfBinaryTree().maxDepth(root)).isEqualTo(1);
    }
}

