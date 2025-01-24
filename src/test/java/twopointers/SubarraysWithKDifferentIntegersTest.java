package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarraysWithKDifferentIntegersTest {

    @Test
    public void testCase1() {
        int actual = new SubarraysWithKDifferentIntegers().subarraysWithKDistinct(
                new int[]{1, 2, 1, 2, 3},
                2
        );
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int actual = new SubarraysWithKDifferentIntegers().subarraysWithKDistinct(
                new int[]{1, 2, 1, 3, 4},
                3
        );
        int expected = 3;
        assertEquals(expected, actual);
    }
}
