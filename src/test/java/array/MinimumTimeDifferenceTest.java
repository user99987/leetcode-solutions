package array;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class MinimumTimeDifferenceTest {

    @Test
    public void testCase1() {
        assertThat(new MinimumTimeDifference().findMinDifference(List.of("23:59", "00:00"))).isEqualTo(1);
    }

    @Test
    public void testCase2() {
        assertThat(new MinimumTimeDifference().findMinDifference(List.of("00:00", "23:59", "00:00"))).isEqualTo(0);
    }
}
