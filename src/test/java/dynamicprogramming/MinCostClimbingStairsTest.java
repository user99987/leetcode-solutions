package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinCostClimbingStairsTest {

    @Test
    public void shouldFindMinimumCostStartingFromIndexOne() {
        assertThat(new MinCostClimbingStairs().minCostClimbingStairs(new int[]{10, 15, 20})).isEqualTo(15);
    }

    @Test
    public void shouldFindMinimumCostForLongerStaircase() {
        assertThat(new MinCostClimbingStairs().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1})).isEqualTo(6);
    }
}
