package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreePathsTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        List<String> expected = List.of("1->2->5", "1->3");
        assertEquals(expected, new BinaryTreePaths().binaryTreePaths(root));
    }

    @Test
    void testCase2() {
        TreeNode root = new TreeNode(1);
        List<String> expected = List.of("1");
        assertEquals(expected, new BinaryTreePaths().binaryTreePaths(root));
    }
}
