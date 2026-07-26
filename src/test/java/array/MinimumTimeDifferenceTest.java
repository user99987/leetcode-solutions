package array;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class MinimumTimeDifferenceTest {

    @Test
    public void shouldFindMinimumDifferenceWrappingMidnight() {
        assertThat(new MinimumTimeDifference().findMinDifference(List.of("23:59", "00:00"))).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroWhenTimeRepeatsInList() {
        assertThat(new MinimumTimeDifference().findMinDifference(List.of("00:00", "23:59", "00:00"))).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroForDuplicateTimePoints() {
        assertThat(new MinimumTimeDifference().findMinDifference(List.of("10:00", "10:00"))).isEqualTo(0);
    }

    @Test
    public void shouldReturnMaxPossibleMinDiffForTwelveHoursApart() {
        assertThat(new MinimumTimeDifference().findMinDifference(List.of("00:00", "12:00"))).isEqualTo(720);
    }

    @Test
    public void shouldTakeShorterPathWhenWrappingAroundMidnight() {
        assertThat(new MinimumTimeDifference().findMinDifference(List.of("23:50", "00:10"))).isEqualTo(20);
    }

    @Test
    public void shouldHandleManyTimePointsWithinSameMinuteWindow() {
        assertThat(new MinimumTimeDifference().findMinDifference(
                List.of("01:01", "02:01", "03:00", "04:04", "23:59", "00:00"))).isEqualTo(1);
    }
}
