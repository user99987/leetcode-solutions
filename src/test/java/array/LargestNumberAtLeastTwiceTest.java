package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LargestNumberAtLeastTwiceTest {

    @Test
    public void shouldFindDominantIndexWhenMaxIsAtLeastTwiceOthers() {
        assertThat(new LargestNumberAtLeastTwice().dominantIndex(new int[]{3, 6, 1, 0})).isEqualTo(1);
    }

    @Test
    public void shouldReturnMinusOneWhenNoDominantElementExists() {
        assertThat(new LargestNumberAtLeastTwice().dominantIndex(new int[]{1, 2, 3, 4})).isEqualTo(-1);
    }

    @Test
    public void shouldReturnZeroForSingleElementArray() {
        assertThat(new LargestNumberAtLeastTwice().dominantIndex(new int[]{1})).isEqualTo(0);
    }

    @Test
    public void shouldReturnIndexOfOnlyNonZeroElement() {
        assertThat(new LargestNumberAtLeastTwice().dominantIndex(new int[]{0, 0, 5, 0})).isEqualTo(2);
    }

    @Test
    public void shouldReturnMaxIndexWhenExactlyTwiceSecondLargest() {
        assertThat(new LargestNumberAtLeastTwice().dominantIndex(new int[]{4, 2, 1})).isEqualTo(0);
    }

    @Test
    public void shouldReturnLastIndexWhenMaxIsAtEnd() {
        assertThat(new LargestNumberAtLeastTwice().dominantIndex(new int[]{1, 2, 0, 10})).isEqualTo(3);
    }

    @Test
    public void shouldReturnFirstIndexWhenAllElementsAreZero() {
        assertThat(new LargestNumberAtLeastTwice().dominantIndex(new int[]{0, 0, 0})).isEqualTo(0);
    }
}
