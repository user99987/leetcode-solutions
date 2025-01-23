package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {

    @Test
    public void testCase1() {
        assertEquals(6, new MaximumSubarray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new MaximumSubarray().maxSubArray(new int[]{1}));
    }

    @Test
    public void testCase3() {
        assertEquals(23, new MaximumSubarray().maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
