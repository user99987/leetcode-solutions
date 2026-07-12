package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumProfitInJobSchedulingTest {

    @Test
    public void testCase1() {
        assertThat(new MaximumProfitInJobScheduling().jobScheduling(
                new int[]{1, 2, 3, 3}, new int[]{3, 4, 5, 6}, new int[]{50, 10, 40, 70})).isEqualTo(120);
    }

    @Test
    public void testCase2() {
        assertThat(new MaximumProfitInJobScheduling().jobScheduling(
                new int[]{1, 2, 3, 4, 6}, new int[]{3, 5, 10, 6, 9}, new int[]{20, 20, 100, 70, 60})).isEqualTo(150);
    }

    @Test
    public void testCase3() {
        assertThat(new MaximumProfitInJobScheduling().jobScheduling(
                new int[]{1, 1, 1}, new int[]{2, 3, 4}, new int[]{5, 6, 4})).isEqualTo(6);
    }
}

