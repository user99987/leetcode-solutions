package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountVowelsPermutationTest {

    @Test
    public void shouldReturnFiveForLengthOne() {
        assertThat(new CountVowelsPermutation().countVowelPermutation(1)).isEqualTo(5);
    }

    @Test
    public void shouldReturnTenForLengthTwo() {
        assertThat(new CountVowelsPermutation().countVowelPermutation(2)).isEqualTo(10);
    }

    @Test
    public void shouldReturnSixtyEightForLengthFive() {
        assertThat(new CountVowelsPermutation().countVowelPermutation(5)).isEqualTo(68);
    }
}
