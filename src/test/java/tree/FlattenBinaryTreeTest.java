package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;

import java.util.List;


public class FlattenBinaryTreeTest {


    @Test
    public void testCase1() {
        Integer[] input = {1, 2, 5, 3, 4, null, 6};
        var root = TreeNode.create(input);
        new FlattenBinaryTree().flatten(root);
        var expected = List.of(1, 2, 3, 4, 5, 6);
        var actual = TreeNode.toList(root);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        Integer[] input = {};
        var root = TreeNode.create(input);
        new FlattenBinaryTree().flatten(root);
        var expected = List.of();
        var actual = TreeNode.toList(root);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        Integer[] input = {0};
        var root = TreeNode.create(input);
        new FlattenBinaryTree().flatten(root);
        var expected = List.of(0);
        var actual = TreeNode.toList(root);
        assertThat(actual).isEqualTo(expected);
    }
}
