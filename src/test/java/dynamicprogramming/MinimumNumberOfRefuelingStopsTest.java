package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumNumberOfRefuelingStopsTest {

    @Test
    public void shouldReturnZeroWhenStartFuelReachesTarget() {
        assertThat(new MinimumNumberOfRefuelingStops().minRefuelStops(1, 1, new int[][]{})).isEqualTo(0);
    }

    @Test
    public void shouldReturnMinusOneWhenSingleStationCannotReachTarget() {
        assertThat(new MinimumNumberOfRefuelingStops().minRefuelStops(100, 1, new int[][]{{10, 100}})).isEqualTo(-1);
    }

    @Test
    public void shouldFindMinimumStopsUsingBestStations() {
        assertThat(new MinimumNumberOfRefuelingStops().minRefuelStops(100, 10, new int[][]{
                {10, 60}, {20, 30}, {30, 30}, {60, 40}
        })).isEqualTo(2);
    }

    @Test
    public void shouldFindSingleStopSufficientForTarget() {
        assertThat(new MinimumNumberOfRefuelingStops().minRefuelStops(100, 50, new int[][]{
                {25, 25}, {50, 50}
        })).isEqualTo(1);
    }

    @Test
    public void shouldReturnMinusOneWhenNoStationsAvailableForLongTarget() {
        assertThat(new MinimumNumberOfRefuelingStops().minRefuelStops(1000, 1, new int[][]{})).isEqualTo(-1);
    }
}

