package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumSizeSubarraySumTest {

    @Test
    public void testCase1() {
        var actual = new MinimumSizeSubarraySum().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        var expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var actual = new MinimumSizeSubarraySum().minSubArrayLen(4, new int[]{1, 4, 4});
        var expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        var actual = new MinimumSizeSubarraySum().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1});
        var expected = 0;
        assertThat(actual).isEqualTo(expected);
    }
}
