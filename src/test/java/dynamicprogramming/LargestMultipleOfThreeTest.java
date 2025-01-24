package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestMultipleOfThreeTest {

    @Test
    public void testCase1() {
        assertEquals("981", new LargestMultipleOfThree().largestMultipleOfThree(new int[]{8, 1, 9}));
    }

    @Test
    public void testCase2() {
        assertEquals("8760", new LargestMultipleOfThree().largestMultipleOfThree(new int[]{8, 6, 7, 1, 0}));
    }

    @Test
    public void testCase3() {
        assertEquals("", new LargestMultipleOfThree().largestMultipleOfThree(new int[]{1}));
    }
}
