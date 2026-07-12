package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;

import java.util.List;


class BinaryTreePathsTest {

    @Test
    void testCase1() {
        var root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        var expected = List.of("1->2->5", "1->3");
        assertThat(new BinaryTreePaths().binaryTreePaths(root)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        var root = new TreeNode(1);
        var expected = List.of("1");
        assertThat(new BinaryTreePaths().binaryTreePaths(root)).isEqualTo(expected);
    }
}
