package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;

import java.util.Arrays;
import java.util.Collections;


class BinaryTreeRightSideViewTest {

    @Test
    void testCase1() {
        var root = new TreeNode(1);
        root.left = new TreeNode(2, null, new TreeNode(5));
        root.right = new TreeNode(3, null, new TreeNode(4));

        var expected = Arrays.asList(1, 3, 4);
        assertThat(new BinaryTreeRightSideView().rightSideView(root)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        var root = new TreeNode(1);
        root.right = new TreeNode(3);

        var expected = Arrays.asList(1, 3);
        assertThat(new BinaryTreeRightSideView().rightSideView(root)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        TreeNode root = null;

        var expected = Collections.emptyList();
        assertThat(new BinaryTreeRightSideView().rightSideView(root)).isEqualTo(expected);
    }
}
