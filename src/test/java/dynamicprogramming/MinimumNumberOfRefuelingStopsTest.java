package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfRefuelingStopsTest {

    @Test
    public void testCase1() {
        assertEquals(0, new MinimumNumberOfRefuelingStops().minRefuelStops(1, 1, new int[][]{}));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new MinimumNumberOfRefuelingStops().minRefuelStops(100, 1, new int[][]{{10, 100}}));
    }

    @Test
    public void testCase3() {
        assertEquals(2, new MinimumNumberOfRefuelingStops().minRefuelStops(100, 10, new int[][]{
                {10, 60}, {20, 30}, {30, 30}, {60, 40}
        }));
    }

    @Test
    public void testCase4() {
        assertEquals(1, new MinimumNumberOfRefuelingStops().minRefuelStops(100, 50, new int[][]{
                {25, 25}, {50, 50}
        }));
    }

    @Test
    public void testCase5() {
        assertEquals(-1, new MinimumNumberOfRefuelingStops().minRefuelStops(1000, 1, new int[][]{}));
    }
}

