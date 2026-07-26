package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MinimumMovesToEqualArrayTest {

    @Test
    public void shouldCountMovesForConsecutiveNumbers() {
        assertThat(new MinimumMovesToEqualArray().minMoves(new int[]{1, 2, 3})).isEqualTo(3);
    }

    @Test
    public void shouldReturnZeroWhenAllElementsAreEqual() {
        assertThat(new MinimumMovesToEqualArray().minMoves(new int[]{1, 1, 1})).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroForSingleElementArray() {
        assertThat(new MinimumMovesToEqualArray().minMoves(new int[]{42})).isEqualTo(0);
    }

    @Test
    public void shouldComputeCorrectlyForNegativeNumbers() {
        assertThat(new MinimumMovesToEqualArray().minMoves(new int[]{-1, -2, -3})).isEqualTo(3);
    }

    @Test
    public void shouldHandleMixedPositiveAndNegativeNumbers() {
        assertThat(new MinimumMovesToEqualArray().minMoves(new int[]{-5, 0, 5})).isEqualTo(15);
    }

    @Test
    public void shouldFitInIntForLargeValues() {
        assertThat(new MinimumMovesToEqualArray().minMoves(new int[]{1000000000, 1000000000, 1000000001})).isEqualTo(1);
    }

    @Test
    public void shouldNotOverflowDuringSummationForLargeArray() {
        // 100 000 elements at 10^9: intermediate sum ~10^14, must be computed with a wider type than int
        int n = 100_000;
        var nums = new int[n];
        java.util.Arrays.fill(nums, 1_000_000_000);
        nums[0] = 999_999_999; // introduces exactly one move needed to equalize
        assertThat(new MinimumMovesToEqualArray().minMoves(nums)).isEqualTo(n - 1);
    }
}
