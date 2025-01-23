package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void testCase1() {
        assertArrayEquals(new int[]{3, 4},
                new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }

    @Test
    public void testCase3() {
        assertArrayEquals(new int[]{-1, -1},
                new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{}, 0));
    }
}

