package binarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchInsertPositionTest {

    @Test
    public void shouldFindExactMatchIndex() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
    }

    @Test
    public void shouldFindInsertIndexBetweenElements() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
    }

    @Test
    public void shouldFindInsertIndexAtEndWhenTargetIsLargest() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
    }

    @Test
    public void shouldFindInsertIndexAtStartWhenTargetIsSmallest() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);
    }

    @Test
    public void shouldFindInsertIndexZeroForSingleElementArray() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1}, 0)).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroWhenTargetMatchesOnlyElement() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{5}, 5)).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneWhenTargetGreaterThanOnlyElement() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{5}, 10)).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroWhenTargetEqualsFirstElement() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5}, 1)).isEqualTo(0);
    }

    @Test
    public void shouldReturnLastIndexWhenTargetEqualsLastElement() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5}, 5)).isEqualTo(2);
    }
}
