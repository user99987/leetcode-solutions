package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MaximumSubarrayTest {

    @Test
    public void testCase1() {
        assertThat(new MaximumSubarray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})).isEqualTo(6);
    }

    @Test
    public void testCase2() {
        assertThat(new MaximumSubarray().maxSubArray(new int[]{1})).isEqualTo(1);
    }

    @Test
    public void testCase3() {
        assertThat(new MaximumSubarray().maxSubArray(new int[]{5, 4, -1, 7, 8})).isEqualTo(23);
    }
}
