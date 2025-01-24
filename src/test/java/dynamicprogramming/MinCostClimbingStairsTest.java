package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCostClimbingStairsTest {

    @Test
    public void testCase1() {
        assertEquals(15, new MinCostClimbingStairs().minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    public void testCase2() {
        assertEquals(6, new MinCostClimbingStairs().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
