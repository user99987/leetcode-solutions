package binarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwimInRisingWaterTest {

    @Test
    public void testCase1() {
        int[][] grid1 = {{0, 2}, {1, 3}};
        assertThat(new SwimInRisingWater().swimInWater(grid1)).isEqualTo(3);
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
        assertThat(new SwimInRisingWater().swimInWater(grid2)).isEqualTo(16);
    }
}
