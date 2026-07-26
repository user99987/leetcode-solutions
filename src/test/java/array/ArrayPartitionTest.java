package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayPartitionTest {

    @Test
    public void shouldMaximizeSumOfMinimumsForFourElements() {
        assertThat(new ArrayPartition().arrayPairSum(new int[]{1, 4, 3, 2})).isEqualTo(4);
    }

    @Test
    public void shouldMaximizeSumOfMinimumsWithDuplicates() {
        assertThat(new ArrayPartition().arrayPairSum(new int[]{6, 2, 6, 5, 1, 2})).isEqualTo(9);
    }

    @Test
    public void shouldReturnMinOfPairForSinglePair() {
        assertThat(new ArrayPartition().arrayPairSum(new int[]{5, 1})).isEqualTo(1);
    }

    @Test
    public void shouldReturnSumOfHalfWhenAllElementsEqual() {
        assertThat(new ArrayPartition().arrayPairSum(new int[]{3, 3, 3, 3})).isEqualTo(6);
    }

    @Test
    public void shouldReturnCorrectMaxSumForNegativeNumbers() {
        // sorted: -4,-3,-2,-1 -> pairs (-4,-3),(-2,-1) -> min sum = -4 + -2 = -6
        assertThat(new ArrayPartition().arrayPairSum(new int[]{-1, -2, -3, -4})).isEqualTo(-6);
    }

    @Test
    public void shouldHandleMixedPositiveAndNegativeNumbers() {
        // sorted: -2,-1,3,4 -> pairs (-2,-1),(3,4) -> -2 + 3 = 1
        assertThat(new ArrayPartition().arrayPairSum(new int[]{3, -1, 4, -2})).isEqualTo(1);
    }
}
