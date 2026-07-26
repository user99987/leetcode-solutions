package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConstrainedSubsequenceSumTest {

    @Test
    public void shouldMaximizeSumWithinConstraint() {
        assertThat(new ConstrainedSubsequenceSum().constrainedSubsetSum(new int[]{10, 2, -10, 5, 20}, 2)).isEqualTo(37);
    }

    @Test
    public void shouldChooseLargestSingleElementWhenAllNegative() {
        assertThat(new ConstrainedSubsequenceSum().constrainedSubsetSum(new int[]{-1, -2, -3}, 1)).isEqualTo(-1);
    }

    @Test
    public void shouldMaximizeSumWithMixedValuesAndConstraint() {
        assertThat(new ConstrainedSubsequenceSum().constrainedSubsetSum(new int[]{10, -2, -10, -5, 20}, 2)).isEqualTo(23);
    }
}
