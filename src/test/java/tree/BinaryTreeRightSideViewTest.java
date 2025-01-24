package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeRightSideViewTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, null, new TreeNode(5));
        root.right = new TreeNode(3, null, new TreeNode(4));

        List<Integer> expected = Arrays.asList(1, 3, 4);
        assertEquals(expected, new BinaryTreeRightSideView().rightSideView(root));
    }

    @Test
    void testCase2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);

        List<Integer> expected = Arrays.asList(1, 3);
        assertEquals(expected, new BinaryTreeRightSideView().rightSideView(root));
    }

    @Test
    void testCase3() {
        TreeNode root = null;

        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, new BinaryTreeRightSideView().rightSideView(root));
    }
}
