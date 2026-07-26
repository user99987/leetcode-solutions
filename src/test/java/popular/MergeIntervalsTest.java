package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class MergeIntervalsTest {

    @Test
    public void shouldMergeOverlappingIntervals() {
        int[][] result = new MergeIntervals().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        assertThat(result).isDeepEqualTo(new int[][]{{1, 6}, {8, 10}, {15, 18}});
    }

    @Test
    public void shouldMergeIntervalsThatTouchAtEndpoint() {
        int[][] result = new MergeIntervals().merge(new int[][]{{1, 4}, {4, 5}});
        assertThat(result).isDeepEqualTo(new int[][]{{1, 5}});
    }
}
