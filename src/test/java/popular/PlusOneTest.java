package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class PlusOneTest {

    @Test
    public void shouldIncrementLastDigitWithoutCarry() {
        assertThat(new PlusOne().plusOne(new int[]{1, 2, 3})).containsExactly(new int[]{1, 2, 4});
    }

    @Test
    public void shouldIncrementLastDigitFromOne() {
        assertThat(new PlusOne().plusOne(new int[]{4, 3, 2, 1})).containsExactly(new int[]{4, 3, 2, 2});
    }

    @Test
    public void shouldIncrementSingleZeroDigit() {
        assertThat(new PlusOne().plusOne(new int[]{0})).containsExactly(new int[]{1});
    }

    @Test
    public void shouldCarryOverWhenAllDigitsAreNine() {
        assertThat(new PlusOne().plusOne(new int[]{9})).containsExactly(new int[]{1, 0});
    }
}
