package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void testCase1() {
        assertEquals(2.0, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    public void testCase2() {
        assertEquals(2.5, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    public void testCase3() {
        assertEquals(0.0, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}));
    }

    @Test
    public void testCase4() {
        assertEquals(1.0, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{}, new int[]{1}));
    }

    @Test
    public void testCase5() {
        assertEquals(2.0, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{2}, new int[]{}));
    }
}
