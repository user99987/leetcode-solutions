package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestSumOfAveragesTest {

    @Test
    public void testCase1() {
        assertEquals(20.0, new LargestSumOfAverages().largestSumOfAverages(new int[]{9, 1, 2, 3, 9}, 3), 1e-6);
    }

    @Test
    public void testCase2() {
        assertEquals(20.5, new LargestSumOfAverages().largestSumOfAverages(new int[]{1, 2, 3, 4, 5, 6, 7}, 4), 1e-6);
    }
}
