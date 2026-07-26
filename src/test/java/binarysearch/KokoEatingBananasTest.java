package binarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class KokoEatingBananasTest {

    @Test
    public void shouldFindMinimumSpeedForEightHours() {
        assertThat(new KokoEatingBananas().minEatingSpeed(new int[]{3, 6, 7, 11}, 8)).isEqualTo(4);
    }

    @Test
    public void shouldFindMinimumSpeedForFiveHours() {
        assertThat(new KokoEatingBananas().minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5)).isEqualTo(30);
    }

    @Test
    public void shouldFindMinimumSpeedForSixHours() {
        assertThat(new KokoEatingBananas().minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6)).isEqualTo(23);
    }

    @Test
    public void shouldReturnSpeedOneWhenHoursEqualPileSize() {
        assertThat(new KokoEatingBananas().minEatingSpeed(new int[]{5}, 5)).isEqualTo(1);
    }

    @Test
    public void shouldReturnSpeedOneWhenHoursEqualPileCount() {
        assertThat(new KokoEatingBananas().minEatingSpeed(new int[]{1, 1, 1}, 3)).isEqualTo(1);
    }

    @Test
    public void shouldReturnSpeedOneWhenHugeHoursAvailable() {
        assertThat(new KokoEatingBananas().minEatingSpeed(new int[]{1000000000}, 1000000000)).isEqualTo(1);
    }

    @Test
    public void shouldReturnMaxPileSpeedForTightestPossibleTime() {
        assertThat(new KokoEatingBananas().minEatingSpeed(new int[]{1000000000}, 1)).isEqualTo(1000000000);
    }
}
