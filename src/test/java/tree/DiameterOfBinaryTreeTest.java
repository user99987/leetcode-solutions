package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;


public class DiameterOfBinaryTreeTest {

    @Test
    public void testCase1() {
        var solution = new DiameterOfBinaryTree();
        Integer[] input = {1, 2, 3, 4, 5};
        var root = TreeNode.create(input);
        int expected = 3;
        int actual = solution.diameterOfBinaryTree(root);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var solution = new DiameterOfBinaryTree();
        Integer[] input = {1, 2};
        var root = TreeNode.create(input);
        int expected = 1;
        int actual = solution.diameterOfBinaryTree(root);
        assertThat(actual).isEqualTo(expected);
    }
}
