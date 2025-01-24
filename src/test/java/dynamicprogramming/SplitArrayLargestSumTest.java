package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitArrayLargestSumTest {

    @Test
    public void testCase1() {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        assertEquals(18, new SplitArrayLargestSum().splitArray(nums, m));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 2, 3, 4, 5};
        int m = 2;
        assertEquals(9, new SplitArrayLargestSum().splitArray(nums, m));
    }

    @Test
    public void testCase3() {
        int[] nums = {1, 4, 4};
        int m = 3;
        assertEquals(4, new SplitArrayLargestSum().splitArray(nums, m));
    }

}
