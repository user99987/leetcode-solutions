package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MonotoneIncreasingDigitsTest {

    @Test
    void testCase1() {
        var n = 10;
        var expected = 9;
        assertThat(new MonotoneIncreasingDigits().monotoneIncreasingDigits(n)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        var n = 1234;
        var expected = 1234;
        assertThat(new MonotoneIncreasingDigits().monotoneIncreasingDigits(n)).isEqualTo(expected);
    }

    @Test
    void testCase3() {
        var n = 332;
        var expected = 299;
        assertThat(new MonotoneIncreasingDigits().monotoneIncreasingDigits(n)).isEqualTo(expected);
    }
}
