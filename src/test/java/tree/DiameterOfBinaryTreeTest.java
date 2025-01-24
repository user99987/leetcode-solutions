package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiameterOfBinaryTreeTest {

    @Test
    public void testCase1() {
        DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
        Integer[] input = {1, 2, 3, 4, 5};
        TreeNode root = TreeNode.create(input);
        int expected = 3;
        int actual = solution.diameterOfBinaryTree(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
        Integer[] input = {1, 2};
        TreeNode root = TreeNode.create(input);
        int expected = 1;
        int actual = solution.diameterOfBinaryTree(root);
        assertEquals(expected, actual);
    }
}
