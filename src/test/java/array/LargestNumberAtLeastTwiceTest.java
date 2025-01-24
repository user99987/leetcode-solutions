package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberAtLeastTwiceTest {

    @Test
    public void testCase1() {
        assertEquals(1, new LargestNumberAtLeastTwice().dominantIndex(new int[]{3, 6, 1, 0}));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new LargestNumberAtLeastTwice().dominantIndex(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new LargestNumberAtLeastTwice().dominantIndex(new int[]{1}));
    }
}
