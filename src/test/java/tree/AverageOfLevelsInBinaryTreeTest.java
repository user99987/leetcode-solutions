package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class AverageOfLevelsInBinaryTreeTest {

    @Test
    public void shouldCalculateAveragesForMultiLevelTree() {
        var root = TreeNode.create(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertThat(new AverageOfLevelsInBinaryTree().averageOfLevels(root))
                .usingElementComparator((a, b) -> Math.abs(a - b) < 1e-5 ? 0 : 1)
                .containsExactly(3.0, 14.5, 11.0);
    }

    @Test
    public void shouldCalculateAveragesForFullTree() {
        var root = TreeNode.create(new Integer[]{3, 9, 20});
        assertThat(new AverageOfLevelsInBinaryTree().averageOfLevels(root))
                .usingElementComparator((a, b) -> Math.abs(a - b) < 1e-5 ? 0 : 1)
                .containsExactly(3.0, 14.5);
    }

    @Test
    public void shouldReturnItsValueForSingleNode() {
        var root = TreeNode.create(new Integer[]{5});
        assertThat(new AverageOfLevelsInBinaryTree().averageOfLevels(root)).containsExactly(5.0);
    }

    @Test
    public void shouldReturnEmptyListWhenRootIsNull() {
        assertThat(new AverageOfLevelsInBinaryTree().averageOfLevels(null)).isEmpty();
    }

    @Test
    public void shouldAverageNegativeValuesCorrectly() {
        var root = TreeNode.create(new Integer[]{-1, -2, -3});
        assertThat(new AverageOfLevelsInBinaryTree().averageOfLevels(root)).containsExactly(-1.0, -2.5);
    }

    @Test
    public void shouldHandleSkewedTreeWithOneNodePerLevel() {
        var root = TreeNode.create(new Integer[]{1, 2, null, 3});
        assertThat(new AverageOfLevelsInBinaryTree().averageOfLevels(root)).containsExactly(1.0, 2.0, 3.0);
    }

    @Test
    public void shouldNotOverflowWhenSummingLargeValues() {
        var root = TreeNode.create(new Integer[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE});
        assertThat(new AverageOfLevelsInBinaryTree().averageOfLevels(root))
                .containsExactly((double) Integer.MAX_VALUE, (double) Integer.MAX_VALUE);
    }
}
