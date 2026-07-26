package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLargestValueInEachTreeRowTest {

    @Test
    public void shouldFindLargestValuePerRow() {
        var root = TreeNode.create(new Integer[]{1, 3, 2, 5, 3, null, 9});
        assertThat(new FindLargestValueInEachTreeRow().largestValues(root)).containsExactly(1, 3, 9);
    }

    @Test
    public void shouldFindLargestValueForSimpleTree() {
        var root = TreeNode.create(new Integer[]{1, 2, 3});
        assertThat(new FindLargestValueInEachTreeRow().largestValues(root)).containsExactly(1, 3);
    }

    @Test
    public void shouldReturnEmptyListWhenRootIsNull() {
        assertThat(new FindLargestValueInEachTreeRow().largestValues(null)).isEmpty();
    }

    @Test
    public void shouldReturnItsValueForSingleNode() {
        var root = TreeNode.create(new Integer[]{7});
        assertThat(new FindLargestValueInEachTreeRow().largestValues(root)).containsExactly(7);
    }

    @Test
    public void shouldHandleNegativeValuesCorrectly() {
        var root = TreeNode.create(new Integer[]{-1, -2, -3});
        assertThat(new FindLargestValueInEachTreeRow().largestValues(root)).containsExactly(-1, -2);
    }

    @Test
    public void shouldHandleSkewedTreeWithSingleValuePerLevel() {
        var root = TreeNode.create(new Integer[]{1, 2, null, 3});
        assertThat(new FindLargestValueInEachTreeRow().largestValues(root)).containsExactly(1, 2, 3);
    }
}
