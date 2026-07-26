package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class FindBottomLeftTreeValueTest {

    @Test
    public void shouldFindLeftmostValueInLastRow() {
        var root = TreeNode.create(new Integer[]{2, 1, 3});
        assertThat(new FindBottomLeftTreeValue().findBottomLeftValue(root)).isEqualTo(1);
    }

    @Test
    public void shouldFindLeftmostValueInDeeperUnbalancedTree() {
        var root = TreeNode.create(new Integer[]{1, 2, 3, 4, null, 5, 6, null, null, 7});
        assertThat(new FindBottomLeftTreeValue().findBottomLeftValue(root)).isEqualTo(7);
    }

    @Test
    public void shouldReturnItsValueForSingleNode() {
        var root = TreeNode.create(new Integer[]{5});
        assertThat(new FindBottomLeftTreeValue().findBottomLeftValue(root)).isEqualTo(5);
    }

    @Test
    public void shouldReturnBottommostAvailableNodeWhenOnlyRightSubtreeExists() {
        var root = TreeNode.create(new Integer[]{1, null, 2, null, 3});
        assertThat(new FindBottomLeftTreeValue().findBottomLeftValue(root)).isEqualTo(3);
    }

    @Test
    public void shouldReturnLeftmostOfLastRowForBalancedTree() {
        var root = TreeNode.create(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        assertThat(new FindBottomLeftTreeValue().findBottomLeftValue(root)).isEqualTo(4);
    }
}
