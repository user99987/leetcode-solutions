package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContinuousSubarraySumTest {

    @Test
    public void testCase1() {
        assertTrue(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
    }

    @Test
    public void testCase2() {
        assertTrue(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
    }

    @Test
    public void testCase3() {
        assertFalse(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13));
    }
}
