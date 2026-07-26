package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestRangeTest {

    @Test
    public void shouldReturnZeroForSingleElement() {
        assertThat(new SmallestRange().smallestRange(new int[]{1}, 0)).isEqualTo(0);
    }

    @Test
    public void shouldCalculateReducedRangeForTwoElements() {
        assertThat(new SmallestRange().smallestRange(new int[]{0, 10}, 2)).isEqualTo(6);
    }

    @Test
    public void shouldReturnZeroWhenAllValuesCanConverge() {
        assertThat(new SmallestRange().smallestRange(new int[]{1, 3, 6}, 3)).isEqualTo(0);
    }

    @Test
    public void shouldLeaveScoreUnchangedWhenKIsZero() {
        assertThat(new SmallestRange().smallestRange(new int[]{1, 5, 9}, 0)).isEqualTo(8);
    }

    @Test
    public void shouldReturnZeroWhenAllElementsAreEqual() {
        assertThat(new SmallestRange().smallestRange(new int[]{5, 5, 5}, 3)).isEqualTo(0);
    }

    @Test
    public void shouldReduceScoreToZeroWithLargeK() {
        assertThat(new SmallestRange().smallestRange(new int[]{0, 100}, 1000)).isEqualTo(0);
    }
}
