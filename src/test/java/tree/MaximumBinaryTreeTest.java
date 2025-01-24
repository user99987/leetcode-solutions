package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumBinaryTreeTest {

    @Test
    public void testCase1() {
        List<Integer> expected = List.of(6, 3, 5, 2, 0, 1);
        List<Integer> actual = TreeNode.toList(new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5}));
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        List<Integer> expected = List.of(3, 2, 1);
        List<Integer> actual = TreeNode.toList(new MaximumBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1}));
        assertEquals(expected, actual);
    }
}
