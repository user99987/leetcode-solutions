package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumNumberOfRefuelingStopsTest {

    @Test
    public void testCase1() {
        assertThat(new MinimumNumberOfRefuelingStops().minRefuelStops(1, 1, new int[][]{})).isEqualTo(0);
    }

    @Test
    public void testCase2() {
        assertThat(new MinimumNumberOfRefuelingStops().minRefuelStops(100, 1, new int[][]{{10, 100}})).isEqualTo(-1);
    }

    @Test
    public void testCase3() {
        assertThat(new MinimumNumberOfRefuelingStops().minRefuelStops(100, 10, new int[][]{
                {10, 60}, {20, 30}, {30, 30}, {60, 40}
        })).isEqualTo(2);
    }

    @Test
    public void testCase4() {
        assertThat(new MinimumNumberOfRefuelingStops().minRefuelStops(100, 50, new int[][]{
                {25, 25}, {50, 50}
        })).isEqualTo(1);
    }

    @Test
    public void testCase5() {
        assertThat(new MinimumNumberOfRefuelingStops().minRefuelStops(1000, 1, new int[][]{})).isEqualTo(-1);
    }
}

