package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaximumSumOfTwoNonOverlappingSubArraysTest {

    @Test
    public void shouldFindMaxSumWithSmallSubarrayLengths() {
        assertThat(new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{0, 6, 5, 2, 2, 5, 1, 9, 4}, 1, 2)).isEqualTo(20);
    }

    @Test
    public void shouldFindMaxSumWithLargerSubarrayLengths() {
        assertThat(new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{3, 8, 1, 3, 2, 1, 8, 9, 0}, 3, 2)).isEqualTo(29);
    }

    @Test
    public void shouldFindMaxSumWithEvenLargerSubarrayLengths() {
        assertThat(new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{2, 1, 5, 6, 0, 9, 5, 0, 3, 8}, 4, 3)).isEqualTo(31);
    }

    @Test
    public void shouldFindMaxSumWhenBothSubarraysAreSizeOne() {
        assertThat(new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{1, 2, 3, 4}, 1, 1)).isEqualTo(7);
    }

    @Test
    public void shouldFindMaxSumWhenSubarraysCoverEntireArray() {
        assertThat(new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{1, 2, 3, 4}, 2, 2)).isEqualTo(10);
    }

    @Test
    public void shouldReturnZeroWhenAllElementsAreZero() {
        assertThat(new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{0, 0, 0, 0}, 1, 1)).isEqualTo(0);
    }

    @Test
    public void shouldFindMaxSumWhenFirstLenSubarrayComesAfterSecondLen() {
        // Best arrangement is secondLen subarray first, then firstLen subarray
        assertThat(new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{9, 9, 1, 1, 9, 9}, 2, 2)).isEqualTo(36);
    }
}
