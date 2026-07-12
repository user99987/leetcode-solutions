package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContinuousSubarraySumTest {

    @Test
    public void testCase1() {
        assertThat(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6)).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6)).isTrue();
    }

    @Test
    public void testCase3() {
        assertThat(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13)).isFalse();
    }
}
