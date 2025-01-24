package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumCostForTicketsTest {

    @Test
    public void testCase1() {
        assertEquals(11, new MinimumCostForTickets().mincostTickets(
                new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}));
    }

    @Test
    public void testCase2() {
        assertEquals(17, new MinimumCostForTickets().mincostTickets(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15}));
    }
}
