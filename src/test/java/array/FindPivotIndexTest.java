package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindPivotIndexTest {

    @Test
    public void shouldFindPivotIndexInMiddleOfArray() {
        assertThat(new FindPivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6})).isEqualTo(3);
    }

    @Test
    public void shouldReturnMinusOneWhenNoPivotExists() {
        assertThat(new FindPivotIndex().pivotIndex(new int[]{1, 2, 3})).isEqualTo(-1);
    }

    @Test
    public void shouldFindPivotIndexAtStartWithNegativeValues() {
        assertThat(new FindPivotIndex().pivotIndex(new int[]{2, 1, -1})).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroForSingleElementArray() {
        assertThat(new FindPivotIndex().pivotIndex(new int[]{5})).isEqualTo(0);
    }

    @Test
    public void shouldFindPivotAtLastIndex() {
        assertThat(new FindPivotIndex().pivotIndex(new int[]{-1, 1, 0})).isEqualTo(2);
    }

    @Test
    public void shouldReturnMinusOneForEmptyArray() {
        assertThat(new FindPivotIndex().pivotIndex(new int[]{})).isEqualTo(-1);
    }

    @Test
    public void shouldReturnMinusOneForNullArray() {
        assertThat(new FindPivotIndex().pivotIndex(null)).isEqualTo(-1);
    }

    @Test
    public void shouldReturnFirstIndexWhenAllElementsAreZero() {
        assertThat(new FindPivotIndex().pivotIndex(new int[]{0, 0, 0, 0})).isEqualTo(0);
    }
}
