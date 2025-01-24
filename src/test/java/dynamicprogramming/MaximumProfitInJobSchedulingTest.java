package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProfitInJobSchedulingTest {

    @Test
    public void testCase1() {
        assertEquals(120, new MaximumProfitInJobScheduling().jobScheduling(
                new int[]{1, 2, 3, 3}, new int[]{3, 4, 5, 6}, new int[]{50, 10, 40, 70}));
    }

    @Test
    public void testCase2() {
        assertEquals(150, new MaximumProfitInJobScheduling().jobScheduling(
                new int[]{1, 2, 3, 4, 6}, new int[]{3, 5, 10, 6, 9}, new int[]{20, 20, 100, 70, 60}));
    }

    @Test
    public void testCase3() {
        assertEquals(6, new MaximumProfitInJobScheduling().jobScheduling(
                new int[]{1, 1, 1}, new int[]{2, 3, 4}, new int[]{5, 6, 4}));
    }
}

