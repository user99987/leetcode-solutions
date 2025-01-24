package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {

    @Test
    public void testCase1() {
        assertEquals(2, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    public void testCase3() {
        assertEquals(4, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    @Test
    public void testCase4() {
        assertEquals(0, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}
