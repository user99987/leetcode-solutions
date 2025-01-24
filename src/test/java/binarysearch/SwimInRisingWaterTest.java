package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwimInRisingWaterTest {

    @Test
    public void testCase1() {
        int[][] grid1 = {{0, 2}, {1, 3}};
        assertEquals(3, new SwimInRisingWater().swimInWater(grid1));
    }

    @Test
    public void testCase2() {
        int[][] grid2 = {
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}
        };
        assertEquals(16, new SwimInRisingWater().swimInWater(grid2));
    }
}
