package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class MergeIntervalsTest {

    @Test
    public void testCase1() {
        int[][] result = new MergeIntervals().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        assertThat(result).isDeepEqualTo(new int[][]{{1, 6}, {8, 10}, {15, 18}});
    }

    @Test
    public void testCase2() {
        int[][] result = new MergeIntervals().merge(new int[][]{{1, 4}, {4, 5}});
        assertThat(result).isDeepEqualTo(new int[][]{{1, 5}});
    }
}
