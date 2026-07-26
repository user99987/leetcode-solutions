package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstMissingPositiveTest {

    @Test
    public void shouldFindMissingPositiveInSimpleArray() {
        assertThat(new FirstMissingPositive().firstMissingPositive(new int[]{1, 2, 0})).isEqualTo(3);
    }

    @Test
    public void shouldFindMissingPositiveWithNegativeAndOutOfOrderValues() {
        assertThat(new FirstMissingPositive().firstMissingPositive(new int[]{3, 4, -1, 1})).isEqualTo(2);
    }

    @Test
    public void shouldReturnOneWhenAllValuesAreLargerThanOne() {
        assertThat(new FirstMissingPositive().firstMissingPositive(new int[]{7, 8, 9, 11, 12})).isEqualTo(1);
    }
}

