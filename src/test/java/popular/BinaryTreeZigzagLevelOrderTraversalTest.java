package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    void testCase1() {
        var root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        assertThat(new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root))
                .containsExactly(List.of(3), List.of(20, 9), List.of(15, 7));
    }

    @Test
    void testCase2() {
        var root = new TreeNode(1);
        assertThat(new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root)).containsExactly(List.of(1));
    }

    @Test
    void testCase3() {
        assertThat(new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(null)).isEmpty();
    }

}
