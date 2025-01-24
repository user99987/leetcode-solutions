package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumOfTwoNonOverlappingSubArraysTest {

    @Test
    public void testCase1() {
        assertEquals(20, new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{0, 6, 5, 2, 2, 5, 1, 9, 4}, 1, 2));
    }

    @Test
    public void testCase2() {
        assertEquals(29, new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{3, 8, 1, 3, 2, 1, 8, 9, 0}, 3, 2));
    }

    @Test
    public void testCase3() {
        assertEquals(31, new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{2, 1, 5, 6, 0, 9, 5, 0, 3, 8}, 4, 3));
    }
}

