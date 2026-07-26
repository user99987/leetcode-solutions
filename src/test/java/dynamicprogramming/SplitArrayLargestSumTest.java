package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitArrayLargestSumTest {

    @Test
    public void shouldMinimizeLargestSumWithTwoSubarrays() {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        assertThat(new SplitArrayLargestSum().splitArray(nums, m)).isEqualTo(18);
    }

    @Test
    public void shouldMinimizeLargestSumWithConsecutiveValues() {
        int[] nums = {1, 2, 3, 4, 5};
        int m = 2;
        assertThat(new SplitArrayLargestSum().splitArray(nums, m)).isEqualTo(9);
    }

    @Test
    public void shouldMinimizeLargestSumWhenSplittingIntoSingleElements() {
        int[] nums = {1, 4, 4};
        int m = 3;
        assertThat(new SplitArrayLargestSum().splitArray(nums, m)).isEqualTo(4);
    }

}
