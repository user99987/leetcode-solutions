package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecoverBinarySearchTreeTest {

    @Test
    public void testCase1() {
        TreeNode root = TreeNode.create(new Integer[]{1, 3, 2});
        new RecoverBinarySearchTree().recoverTree(root);
        List<Integer> expected = List.of(3, 1, 2);
        assertEquals(expected, TreeNode.toList(root));
    }

    @Test
    public void testCase2() {
        TreeNode root = TreeNode.create(new Integer[]{3, 1, 4, 2});
        new RecoverBinarySearchTree().recoverTree(root);
        List<Integer> expected = List.of(3, 2, 4, 1);
        assertEquals(expected, TreeNode.toList(root));
    }
}
