package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SubarraySumEqualsKTest {

    @Test
    public void shouldCountSubarraysSummingToKWithOnes() {
        assertThat(new SubarraySumEqualsK().subarraySum(new int[]{1, 1, 1}, 2)).isEqualTo(2);
    }

    @Test
    public void shouldCountSubarraysSummingToKWithMixedValues() {
        assertThat(new SubarraySumEqualsK().subarraySum(new int[]{1, 2, 3}, 3)).isEqualTo(2);
    }

    @Test
    public void shouldReturnOneWhenSingleElementEqualsK() {
        assertThat(new SubarraySumEqualsK().subarraySum(new int[]{5}, 5)).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroWhenNoSubarrayMatches() {
        assertThat(new SubarraySumEqualsK().subarraySum(new int[]{1, 2, 3}, 100)).isEqualTo(0);
    }

    @Test
    public void shouldCountCorrectlyWithNegativeNumbers() {
        assertThat(new SubarraySumEqualsK().subarraySum(new int[]{-1, -1, 1}, 0)).isEqualTo(1);
    }

    @Test
    public void shouldCountZeroSumSubarraysWhenKIsZero() {
        assertThat(new SubarraySumEqualsK().subarraySum(new int[]{0, 0, 0}, 0)).isEqualTo(6);
    }

    @Test
    public void shouldCountMultipleMatchesWithMixedPositiveAndNegative() {
        assertThat(new SubarraySumEqualsK().subarraySum(new int[]{1, -1, 0}, 0)).isEqualTo(3);
    }
}
