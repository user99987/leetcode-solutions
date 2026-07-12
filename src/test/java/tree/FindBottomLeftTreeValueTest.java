package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import utils.TreeNode;


class FindBottomLeftTreeValueTest {

    @Test
    void testCase1() {
        var root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertThat(new FindBottomLeftTreeValue().findBottomLeftValue(root)).isEqualTo(1);
    }

    @Test
    void testCase2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, new TreeNode(5, new TreeNode(7), null), new TreeNode(6)));
        assertThat(new FindBottomLeftTreeValue().findBottomLeftValue(root)).isEqualTo(7);
    }
}
