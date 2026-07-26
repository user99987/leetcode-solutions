package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class MedianOfTwoSortedArraysTest {

    @Test
    public void shouldFindMedianOfOddTotalLength() {
        assertThat(new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 3}, new int[]{2})).isEqualTo(2.0);
    }

    @Test
    public void shouldFindMedianOfEvenTotalLength() {
        assertThat(new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})).isEqualTo(2.5);
    }

    @Test
    public void shouldFindMedianWhenAllValuesAreEqual() {
        assertThat(new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0})).isEqualTo(0.0);
    }

    @Test
    public void shouldFindMedianWhenFirstArrayIsEmpty() {
        assertThat(new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{}, new int[]{1})).isEqualTo(1.0);
    }

    @Test
    public void shouldFindMedianWhenSecondArrayIsEmpty() {
        assertThat(new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{2}, new int[]{})).isEqualTo(2.0);
    }
}
