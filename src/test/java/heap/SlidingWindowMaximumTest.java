package heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SlidingWindowMaximumTest {

    @Test
    public void shouldFindMaxForEachWindowOfSizeThree() {
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3))
                .containsExactly(3, 3, 5, 5, 6, 7);
    }

    @Test
    public void shouldReturnSameArrayWhenWindowSizeIsOne() {
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(new int[]{1}, 1)).containsExactly(1);
    }

    @Test
    public void shouldReturnSameArrayForTwoElementsWithWindowSizeOne() {
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(new int[]{1, -1}, 1)).containsExactly(1, -1);
    }

    @Test
    public void shouldReturnSingleMaxWhenWindowCoversWholeArray() {
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(new int[]{9, 11}, 2)).containsExactly(11);
    }

    @Test
    public void shouldReturnMaxForNegativeAndPositivePair() {
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(new int[]{4, -2}, 2)).containsExactly(4);
    }

    @Test
    public void shouldReturnSingleMaxWhenWindowSizeEqualsArrayLength() {
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(new int[]{3, 1, 4, 1, 5}, 5)).containsExactly(5);
    }

    @Test
    public void shouldReturnFirstElementAsMaxForDecreasingSequence() {
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(new int[]{5, 4, 3, 2, 1}, 2)).containsExactly(5, 4, 3, 2);
    }

    @Test
    public void shouldReturnSameValueThroughoutWhenAllElementsAreEqual() {
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(new int[]{2, 2, 2, 2}, 2)).containsExactly(2, 2, 2);
    }
}
