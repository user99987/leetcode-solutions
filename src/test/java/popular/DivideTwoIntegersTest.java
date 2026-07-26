package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivideTwoIntegersTest {

    @Test
    public void shouldDivideAndTruncateTowardZero() {
        assertThat(new DivideTwoIntegers().divide(10, 3)).isEqualTo(3);
    }

    @Test
    public void shouldDivideWithNegativeDivisor() {
        assertThat(new DivideTwoIntegers().divide(7, -3)).isEqualTo(-2);
    }

    @Test
    public void shouldReturnZeroWhenDividendIsZero() {
        assertThat(new DivideTwoIntegers().divide(0, 1)).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneWhenDividendEqualsDivisor() {
        assertThat(new DivideTwoIntegers().divide(1, 1)).isEqualTo(1);
    }
}
