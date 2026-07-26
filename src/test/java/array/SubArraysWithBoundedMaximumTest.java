package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SubArraysWithBoundedMaximumTest {

    @Test
    public void shouldCountSubarraysWithinBoundsForSmallArray() {
        assertThat(new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3)).isEqualTo(3);
    }

    @Test
    public void shouldCountSubarraysWithinBoundsForWiderRange() {
        assertThat(new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{2, 9, 2, 5, 6}, 2, 8)).isEqualTo(7);
    }

    @Test
    public void shouldReturnOneForSingleElementWithinRange() {
        assertThat(new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{5}, 1, 10)).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroForSingleElementOutOfRange() {
        assertThat(new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{20}, 1, 10)).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroWhenAllElementsExceedUpperBound() {
        assertThat(new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{100, 200, 300}, 1, 10)).isEqualTo(0);
    }

    @Test
    public void shouldCountAllSubarraysWhenAllElementsWithinRange() {
        // n elements => n*(n+1)/2 subarrays, all valid
        assertThat(new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{1, 2, 3}, 1, 3)).isEqualTo(6);
    }

    @Test
    public void shouldCountOnlyExactMatchesWhenLeftEqualsRight() {
        // Valid subarrays with max == 2: [2], [1,2], [2,1], [1,2,1]
        assertThat(new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{1, 2, 1}, 2, 2)).isEqualTo(4);
    }
}
