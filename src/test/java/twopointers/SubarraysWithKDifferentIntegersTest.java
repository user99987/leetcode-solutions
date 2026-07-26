package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubarraysWithKDifferentIntegersTest {

    @Test
    public void shouldCountSubarraysWithExactlyTwoDistinctIntegers() {
        assertThat(new SubarraysWithKDifferentIntegers().subarraysWithKDistinct(new int[]{1, 2, 1, 2, 3}, 2)).isEqualTo(7);
    }

    @Test
    public void shouldCountSubarraysWithExactlyThreeDistinctIntegers() {
        assertThat(new SubarraysWithKDifferentIntegers().subarraysWithKDistinct(new int[]{1, 2, 1, 3, 4}, 3)).isEqualTo(3);
    }

    @Test
    public void shouldCountOneSubarrayForSingleElementArrayWithKOne() {
        assertThat(new SubarraysWithKDifferentIntegers().subarraysWithKDistinct(new int[]{5}, 1)).isEqualTo(1);
    }

    @Test
    public void shouldCountAllSubarraysWhenAllElementsAreSameAndKIsOne() {
        // n elements, all same value: n*(n+1)/2 subarrays, all with exactly 1 distinct value
        assertThat(new SubarraysWithKDifferentIntegers().subarraysWithKDistinct(new int[]{2, 2, 2, 2}, 1)).isEqualTo(10);
    }

    @Test
    public void shouldReturnZeroWhenKExceedsDistinctValuesPresent() {
        assertThat(new SubarraysWithKDifferentIntegers().subarraysWithKDistinct(new int[]{1, 1, 1}, 2)).isEqualTo(0);
    }

    @Test
    public void shouldCountOnlyFullArrayWhenAllElementsAreDistinctAndKEqualsLength() {
        assertThat(new SubarraysWithKDifferentIntegers().subarraysWithKDistinct(new int[]{1, 2, 3}, 3)).isEqualTo(1);
    }
}
