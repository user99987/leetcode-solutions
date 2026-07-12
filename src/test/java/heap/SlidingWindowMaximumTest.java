package heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SlidingWindowMaximumTest {

    @Test
    public void testCase1() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        var k = 3;
        int[] expected = {3, 3, 5, 5, 6, 7};
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(nums, k)).containsExactly(expected);
    }

    @Test
    public void testCase2() {
        int[] nums = {1};
        var k = 1;
        int[] expected = {1};
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(nums, k)).containsExactly(expected);
    }

    @Test
    public void testCase3() {
        int[] nums = {1, -1};
        var k = 1;
        int[] expected = {1, -1};
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(nums, k)).containsExactly(expected);
    }

    @Test
    public void testCase4() {
        int[] nums = {9, 11};
        var k = 2;
        int[] expected = {11};
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(nums, k)).containsExactly(expected);
    }

    @Test
    public void testCase5() {
        int[] nums = {4, -2};
        var k = 2;
        int[] expected = {4};
        assertThat(new SlidingWindowMaximum().maxSlidingWindow(nums, k)).containsExactly(expected);
    }
}
