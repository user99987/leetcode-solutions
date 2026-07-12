package binarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchInsertPositionTest {

    @Test
    public void testCase1() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
    }

    @Test
    public void testCase3() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
    }

    @Test
    public void testCase4() {
        assertThat(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);
    }
}
