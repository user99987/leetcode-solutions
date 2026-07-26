package popular;

import org.junit.jupiter.api.Test;
import utils.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;


public class SymmetricTreeTest {

    @Test
    public void shouldReturnTrueForMirroredTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        assertThat(new SymmetricTree().isSymmetric(root)).isTrue();
    }

    @Test
    public void shouldReturnFalseForAsymmetricTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));
        assertThat(new SymmetricTree().isSymmetric(root)).isFalse();
    }
}
