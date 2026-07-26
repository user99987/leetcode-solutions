package tree;

import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class MostFrequentSubtreeSumTest {

    @Test
    public void shouldReturnAllMostFrequentSubtreeSums() {
        var root = TreeNode.create(new Integer[]{5, 2, -3});
        assertThat(new MostFrequentSubtreeSum().findFrequentTreeSum(root)).containsExactlyInAnyOrder(2, -3, 4);
    }

    @Test
    public void shouldReturnSingleSumWhenOneSumIsMostFrequent() {
        var root = TreeNode.create(new Integer[]{5, 2, -5});
        assertThat(new MostFrequentSubtreeSum().findFrequentTreeSum(root)).containsExactly(2);
    }

    @Test
    public void shouldReturnItsValueForSingleNode() {
        var root = TreeNode.create(new Integer[]{7});
        assertThat(new MostFrequentSubtreeSum().findFrequentTreeSum(root)).containsExactly(7);
    }

    @Test
    public void shouldReturnSumWhenAllSubtreeSumsAreEqual() {
        var root = TreeNode.create(new Integer[]{0, 0, 0});
        assertThat(new MostFrequentSubtreeSum().findFrequentTreeSum(root)).containsExactly(0);
    }

    @Test
    public void shouldHandleNegativeValuesCorrectly() {
        var root = TreeNode.create(new Integer[]{-1, -2, -3});
        assertThat(new MostFrequentSubtreeSum().findFrequentTreeSum(root)).containsExactlyInAnyOrder(-2, -3, -6);
    }
}
