package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MakeArrayStrictlyIncreasingTest {

    @Test
    public void shouldFindMinimumOperationsWithSingleReplacement() {
        assertThat(new MakeArrayStrictlyIncreasing().makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 3, 2, 4})).isEqualTo(1);
    }

    @Test
    public void shouldFindMinimumOperationsWithTwoReplacements() {
        assertThat(new MakeArrayStrictlyIncreasing().makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{4, 3, 1})).isEqualTo(2);
    }

    @Test
    public void shouldReturnMinusOneWhenArrayCannotBeMadeIncreasing() {
        assertThat(new MakeArrayStrictlyIncreasing().makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 6, 3, 3})).isEqualTo(-1);
    }
}
