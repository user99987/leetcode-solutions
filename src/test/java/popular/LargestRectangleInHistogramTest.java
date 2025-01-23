package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestRectangleInHistogramTest {

    @Test
    public void testCase1() {
        assertEquals(10, new LargestRectangleInHistogram().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    @Test
    public void testCase2() {
        assertEquals(4, new LargestRectangleInHistogram().largestRectangleArea(new int[]{2, 4}));
    }
}
