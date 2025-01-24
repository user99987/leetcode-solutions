package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfTapsTest {

    @Test
    public void testCase1() {
        assertEquals(1, new MinimumNumberOfTaps().minTaps(5, new int[]{3, 4, 1, 1, 0, 0}));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new MinimumNumberOfTaps().minTaps(3, new int[]{0, 0, 0, 0}));
    }

    @Test
    public void testCase3() {
        assertEquals(3, new MinimumNumberOfTaps().minTaps(7, new int[]{1, 2, 1, 0, 2, 1, 0, 1}));
    }

    @Test
    public void testCase4() {
        assertEquals(2, new MinimumNumberOfTaps().minTaps(8, new int[]{4, 0, 0, 0, 0, 0, 0, 0, 4}));
    }

    @Test
    public void testCase5() {
        assertEquals(0, new MinimumNumberOfTaps().minTaps(0, new int[]{0}));
    }
}
