package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlattenBinaryTreeTest {


    @Test
    public void testCase1() {
        Integer[] input = {1, 2, 5, 3, 4, null, 6};
        TreeNode root = TreeNode.create(input);
        new FlattenBinaryTree().flatten(root);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> actual = TreeNode.toList(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        Integer[] input = {};
        TreeNode root = TreeNode.create(input);
        new FlattenBinaryTree().flatten(root);
        List<Integer> expected = List.of();
        List<Integer> actual = TreeNode.toList(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        Integer[] input = {0};
        TreeNode root = TreeNode.create(input);
        new FlattenBinaryTree().flatten(root);
        List<Integer> expected = List.of(0);
        List<Integer> actual = TreeNode.toList(root);
        assertEquals(expected, actual);
    }
}
