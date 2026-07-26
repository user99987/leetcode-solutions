package binarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwimInRisingWaterTest {

    @Test
    public void shouldFindMinimumTimeForSmallGrid() {
        assertThat(new SwimInRisingWater().swimInWater(new int[][]{{0, 2}, {1, 3}})).isEqualTo(3);
    }

    @Test
    public void shouldFindMinimumTimeForLargerGrid() {
        int[][] grid = {
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}
        };
        assertThat(new SwimInRisingWater().swimInWater(grid)).isEqualTo(16);
    }

    @Test
    public void shouldReturnElevationForSingleCellGrid() {
        assertThat(new SwimInRisingWater().swimInWater(new int[][]{{5}})).isEqualTo(5);
    }

    @Test
    public void shouldReturnMaxElevationForSmallDiagonalGrid() {
        assertThat(new SwimInRisingWater().swimInWater(new int[][]{{0, 1}, {2, 3}})).isEqualTo(3);
    }

    @Test
    public void shouldReturnMaxElevationForIncreasingRowMajorGrid() {
        int[][] grid = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        assertThat(new SwimInRisingWater().swimInWater(grid)).isEqualTo(8);
    }
}
