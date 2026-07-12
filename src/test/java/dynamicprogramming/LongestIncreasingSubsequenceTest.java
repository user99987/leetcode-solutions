package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void testCase1() {
        assertThat(new LongestIncreasingSubsequence().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18})).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new LongestIncreasingSubsequence().lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3})).isEqualTo(4);
    }

    @Test
    public void testCase3() {
        assertThat(new LongestIncreasingSubsequence().lengthOfLIS(new int[]{7, 7, 7, 7, 7})).isEqualTo(1);
    }
}
