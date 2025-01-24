package heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SlidingWindowMaximumTest {

    @Test
    public void testCase1() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] expected = {3, 3, 5, 5, 6, 7};
        assertArrayEquals(expected, new SlidingWindowMaximum().maxSlidingWindow(nums, k));
    }

    @Test
    public void testCase2() {
        int[] nums = {1};
        int k = 1;
        int[] expected = {1};
        assertArrayEquals(expected, new SlidingWindowMaximum().maxSlidingWindow(nums, k));
    }

    @Test
    public void testCase3() {
        int[] nums = {1, -1};
        int k = 1;
        int[] expected = {1, -1};
        assertArrayEquals(expected, new SlidingWindowMaximum().maxSlidingWindow(nums, k));
    }

    @Test
    public void testCase4() {
        int[] nums = {9, 11};
        int k = 2;
        int[] expected = {11};
        assertArrayEquals(expected, new SlidingWindowMaximum().maxSlidingWindow(nums, k));
    }

    @Test
    public void testCase5() {
        int[] nums = {4, -2};
        int k = 2;
        int[] expected = {4};
        assertArrayEquals(expected, new SlidingWindowMaximum().maxSlidingWindow(nums, k));
    }
}
