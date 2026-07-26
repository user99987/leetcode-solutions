package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RelativeSortArrayTest {

    @Test
    public void shouldSortByOrderArrayThenAscendingForRemaining() {
        assertThat(new RelativeSortArray().relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})).containsExactly(new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19});
    }

    @Test
    public void shouldSortByOrderArrayWithFewerRemainingElements() {
        assertThat(new RelativeSortArray().relativeSortArray(new int[]{28, 6, 22, 8, 44, 17}, new int[]{22, 28, 8, 6})).containsExactly(new int[]{22, 28, 8, 6, 17, 44});
    }

    @Test
    public void shouldHaveNoTrailingElementsWhenAllValuesAppearInOrderArray() {
        assertThat(new RelativeSortArray().relativeSortArray(new int[]{2, 1, 1, 2}, new int[]{1, 2})).containsExactly(new int[]{1, 1, 2, 2});
    }

    @Test
    public void shouldSortAllElementsAtEndWhenNoneMatchOrderArray() {
        // arr2 has values that appear zero times in arr1, and arr1 has values not present in arr2
        assertThat(new RelativeSortArray().relativeSortArray(new int[]{5, 3, 1}, new int[]{9})).containsExactly(new int[]{1, 3, 5});
    }

    @Test
    public void shouldHandleSingleElementArrays() {
        assertThat(new RelativeSortArray().relativeSortArray(new int[]{7}, new int[]{7})).containsExactly(new int[]{7});
    }

    @Test
    public void shouldHandleZeroValuesCorrectly() {
        assertThat(new RelativeSortArray().relativeSortArray(new int[]{0, 1, 0, 2}, new int[]{2, 0})).containsExactly(new int[]{2, 0, 0, 1});
    }
}
