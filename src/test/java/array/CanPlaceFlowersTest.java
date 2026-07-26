package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CanPlaceFlowersTest {

    @Test
    public void shouldPlaceSingleFlowerInMiddleGap() {
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)).isTrue();
    }

    @Test
    public void shouldFailToPlaceTwoFlowersInSmallGap() {
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)).isFalse();
    }

    @Test
    public void shouldPlaceTwoFlowersAroundExistingOne() {
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 2)).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenZeroFlowersRequested() {
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 0)).isTrue();
    }

    @Test
    public void shouldPlaceOneFlowerInSingleEmptyPlot() {
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{0}, 1)).isTrue();
    }

    @Test
    public void shouldFailToPlaceFlowerInSingleOccupiedPlot() {
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{1}, 1)).isFalse();
    }

    @Test
    public void shouldPlaceMaximumPossibleFlowersInAllEmptyPlots() {
        // [0,0,0,0,0] can fit 3 flowers at indices 0,2,4
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 3)).isTrue();
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{0, 0, 0, 0, 0}, 4)).isFalse();
    }

    @Test
    public void shouldFailToPlaceFlowerInAllOccupiedPlots() {
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 1, 1}, 1)).isFalse();
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 1, 1}, 0)).isTrue();
    }
}
