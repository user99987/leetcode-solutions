package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageOfLevelsInBinaryTreeTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        List<Double> expected = Arrays.asList(3.00000, 14.50000, 11.00000);
        assertEquals(expected, new AverageOfLevelsInBinaryTree().averageOfLevels(root));
    }

    @Test
    void testCase2() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9, new TreeNode(15), new TreeNode(7));
        root.right = new TreeNode(20);

        List<Double> expected = Arrays.asList(3.00000, 14.50000, 11.00000);
        assertEquals(expected, new AverageOfLevelsInBinaryTree().averageOfLevels(root));
    }
}
