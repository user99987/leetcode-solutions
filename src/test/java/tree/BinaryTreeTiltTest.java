package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;


class BinaryTreeTiltTest {

    @Test
    void shouldCalculateTiltForSimpleTree() {
        var root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertThat(new BinaryTreeTilt().findTilt(root)).isEqualTo(1);
    }

    @Test
    void shouldCalculateTiltForMultiLevelTree() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(3), new TreeNode(5)),
                new TreeNode(9, null, new TreeNode(7)));
        assertThat(new BinaryTreeTilt().findTilt(root)).isEqualTo(15);
    }

    @Test
    void shouldCalculateTiltForDeeperTreeWithDuplicateValues() {
        TreeNode root = new TreeNode(21,
                new TreeNode(7,
                        new TreeNode(1, new TreeNode(3), new TreeNode(3)),
                        new TreeNode(1)),
                new TreeNode(14,
                        new TreeNode(2),
                        new TreeNode(2)));
        assertThat(new BinaryTreeTilt().findTilt(root)).isEqualTo(9);
    }
}
