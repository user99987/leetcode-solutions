package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumSizeSubarraySumTest {

    @Test
    public void shouldFindMinimalLengthSubarrayMeetingTarget() {
        assertThat(new MinimumSizeSubarraySum().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3})).isEqualTo(2);
    }

    @Test
    public void shouldFindSingleElementMeetingTarget() {
        assertThat(new MinimumSizeSubarraySum().minSubArrayLen(4, new int[]{1, 4, 4})).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroWhenTargetUnreachable() {
        assertThat(new MinimumSizeSubarraySum().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1})).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneWhenSingleElementMeetsTarget() {
        assertThat(new MinimumSizeSubarraySum().minSubArrayLen(5, new int[]{5})).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroWhenSingleElementBelowTarget() {
        assertThat(new MinimumSizeSubarraySum().minSubArrayLen(10, new int[]{5})).isEqualTo(0);
    }

    @Test
    public void shouldReturnFullLengthWhenEntireArrayNeeded() {
        assertThat(new MinimumSizeSubarraySum().minSubArrayLen(15, new int[]{1, 2, 3, 4, 5})).isEqualTo(5);
    }

    @Test
    public void shouldReturnMinimalLengthForExactSumMatch() {
        assertThat(new MinimumSizeSubarraySum().minSubArrayLen(6, new int[]{10, 2, 3})).isEqualTo(1);
    }
}
