package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContinuousSubarraySumTest {

    @Test
    public void shouldFindSubarrayOfSizeTwoSummingToMultiple() {
        assertThat(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6)).isTrue();
    }

    @Test
    public void shouldFindFullArraySubarraySummingToMultiple() {
        assertThat(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6)).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenNoSubarraySumsToMultiple() {
        assertThat(new ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13)).isFalse();
    }
}
