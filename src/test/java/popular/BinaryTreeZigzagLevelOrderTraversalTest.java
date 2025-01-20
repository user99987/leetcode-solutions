package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    void testCase1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        assertTrue(new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root).containsAll(List.of(List.of(3), List.of(20, 9), List.of(15, 7))));
    }

    @Test
    void testCase2() {
        TreeNode root = new TreeNode(1);
        assertTrue(new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root).contains(List.of(1)));
    }

    @Test
    void testCase3() {
        assertTrue(new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(null).isEmpty());
    }

}
