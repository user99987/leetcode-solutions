package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MonotoneIncreasingDigitsTest {

    @Test
    void shouldDecrementToSingleDigitWhenAdjacentDigitsDecrease() {
        var n = 10;
        var expected = 9;
        assertThat(new MonotoneIncreasingDigits().monotoneIncreasingDigits(n)).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameNumberWhenAlreadyMonotoneIncreasing() {
        var n = 1234;
        var expected = 1234;
        assertThat(new MonotoneIncreasingDigits().monotoneIncreasingDigits(n)).isEqualTo(expected);
    }

    @Test
    void shouldAdjustDigitsWhenDecreaseOccursInMiddle() {
        var n = 332;
        var expected = 299;
        assertThat(new MonotoneIncreasingDigits().monotoneIncreasingDigits(n)).isEqualTo(expected);
    }
}
