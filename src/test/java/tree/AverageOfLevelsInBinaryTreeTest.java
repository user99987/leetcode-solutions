package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;

import java.util.Arrays;


class AverageOfLevelsInBinaryTreeTest {

    @Test
    void testCase1() {
        var root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        var expected = Arrays.asList(3.00000, 14.50000, 11.00000);
        assertThat(new AverageOfLevelsInBinaryTree().averageOfLevels(root)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        var root = new TreeNode(3);
        root.left = new TreeNode(9, new TreeNode(15), new TreeNode(7));
        root.right = new TreeNode(20);

        var expected = Arrays.asList(3.00000, 14.50000, 11.00000);
        assertThat(new AverageOfLevelsInBinaryTree().averageOfLevels(root)).isEqualTo(expected);
    }
}
