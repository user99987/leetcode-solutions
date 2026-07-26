package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LargestRectangleInHistogramTest {

    @Test
    public void shouldFindLargestRectangleInVariedHeights() {
        assertThat(new LargestRectangleInHistogram().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3})).isEqualTo(10);
    }

    @Test
    public void shouldFindLargestRectangleForTwoBars() {
        assertThat(new LargestRectangleInHistogram().largestRectangleArea(new int[]{2, 4})).isEqualTo(4);
    }
}
