package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void testCase1() {
        assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    public void testCase2() {
        assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }

    @Test
    public void testCase3() {
        assertEquals(1, new LongestIncreasingSubsequence().lengthOfLIS(new int[]{7, 7, 7, 7, 7}));
    }
}
