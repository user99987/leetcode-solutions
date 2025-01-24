package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestRangeTest {

    @Test
    public void testCase1() {
        int actual = new SmallestRange().smallestRange(new int[]{1}, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int actual = new SmallestRange().smallestRange(new int[]{0, 10}, 2);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        int actual = new SmallestRange().smallestRange(new int[]{1, 3, 6}, 3);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
