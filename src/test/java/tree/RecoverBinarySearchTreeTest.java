package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;

import java.util.List;


public class RecoverBinarySearchTreeTest {

    @Test
    public void testCase1() {
        var root = TreeNode.create(new Integer[]{1, 3, 2});
        new RecoverBinarySearchTree().recoverTree(root);
        var expected = List.of(3, 1, 2);
        assertThat(TreeNode.toList(root)).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var root = TreeNode.create(new Integer[]{3, 1, 4, 2});
        new RecoverBinarySearchTree().recoverTree(root);
        var expected = List.of(3, 2, 4, 1);
        assertThat(TreeNode.toList(root)).isEqualTo(expected);
    }
}
