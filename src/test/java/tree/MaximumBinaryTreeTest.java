package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;

import java.util.List;


public class MaximumBinaryTreeTest {

    @Test
    public void testCase1() {
        var expected = List.of(6, 3, 5, 2, 0, 1);
        var actual = TreeNode.toList(new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5}));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var expected = List.of(3, 2, 1);
        var actual = TreeNode.toList(new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1}));
        assertThat(actual).isEqualTo(expected);
    }
}
