package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumNumberOfTapsTest {

    @Test
    public void shouldFindMinimumTapsForFullCoverage() {
        assertThat(new MinimumNumberOfTaps().minTaps(5, new int[]{3, 4, 1, 1, 0, 0})).isEqualTo(1);
    }

    @Test
    public void shouldReturnMinusOneWhenGardenCannotBeFullyCovered() {
        assertThat(new MinimumNumberOfTaps().minTaps(3, new int[]{0, 0, 0, 0})).isEqualTo(-1);
    }

    @Test
    public void shouldFindMinimumTapsForLargerGarden() {
        assertThat(new MinimumNumberOfTaps().minTaps(7, new int[]{1, 2, 1, 0, 2, 1, 0, 1})).isEqualTo(3);
    }

    @Test
    public void shouldFindMinimumTapsWithSymmetricRanges() {
        assertThat(new MinimumNumberOfTaps().minTaps(8, new int[]{4, 0, 0, 0, 0, 0, 0, 0, 4})).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForZeroLengthGarden() {
        assertThat(new MinimumNumberOfTaps().minTaps(0, new int[]{0})).isEqualTo(0);
    }
}
