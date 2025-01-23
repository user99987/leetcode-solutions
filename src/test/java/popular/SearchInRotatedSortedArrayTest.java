package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void testCase1() {
        assertEquals(4, new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    public void testCase3() {
        assertEquals(-1, new SearchInRotatedSortedArray().search(new int[]{1}, 0));
    }
}
