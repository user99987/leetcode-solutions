package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;


public class ValidateBinarySearchTreeTest {

    @Test
    public void testCase1() {
        var root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertThat(new ValidateBinarySearchTree().isValidBST(root)).isTrue();
    }

    @Test
    public void testCase2() {
        var root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        assertThat(new ValidateBinarySearchTree().isValidBST(root)).isFalse();
    }
}
