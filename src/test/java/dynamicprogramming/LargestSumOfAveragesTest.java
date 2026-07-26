package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LargestSumOfAveragesTest {

    @Test
    public void shouldMaximizeSumOfAveragesWithThreeGroups() {
        assertThat(new LargestSumOfAverages().largestSumOfAverages(new int[]{9, 1, 2, 3, 9}, 3)).isEqualTo(20.0);
    }

    @Test
    public void shouldMaximizeSumOfAveragesWithFourGroups() {
        assertThat(new LargestSumOfAverages().largestSumOfAverages(new int[]{1, 2, 3, 4, 5, 6, 7}, 4)).isEqualTo(20.5);
    }
}
