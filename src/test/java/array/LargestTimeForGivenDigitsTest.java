package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestTimeForGivenDigitsTest {

    @Test
    public void testCase1() {
        assertEquals("23:41", new LargestTimeForGivenDigits().largestTimeFromDigits(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testCase2() {
        assertEquals("", new LargestTimeForGivenDigits().largestTimeFromDigits(new int[]{5, 5, 5, 5}));
    }
}
