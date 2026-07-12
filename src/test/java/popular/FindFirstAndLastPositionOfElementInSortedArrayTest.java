package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void testCase1() {
        assertThat(new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8))
                .containsExactly(3, 4);
    }

    @Test
    public void testCase2() {
        assertThat(new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6))
                .containsExactly(-1, -1);
    }

    @Test
    public void testCase3() {
        assertThat(new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{}, 0))
                .containsExactly(-1, -1);
    }
}

