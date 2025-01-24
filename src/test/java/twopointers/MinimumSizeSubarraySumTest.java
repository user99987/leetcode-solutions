package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSizeSubarraySumTest {

    @Test
    public void testCase1() {
        int actual = new MinimumSizeSubarraySum().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int actual = new MinimumSizeSubarraySum().minSubArrayLen(4, new int[]{1, 4, 4});
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        int actual = new MinimumSizeSubarraySum().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1});
        int expected = 0;
        assertEquals(expected, actual);
    }
}
