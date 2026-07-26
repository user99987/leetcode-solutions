package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ReverseIntegerTest {

    @Test
    public void shouldReversePositiveNumber() {
        assertThat(new ReverseInteger().reverse(123)).isEqualTo(321);
    }

    @Test
    public void shouldReverseNegativeNumber() {
        assertThat(new ReverseInteger().reverse(-123)).isEqualTo(-321);
    }

    @Test
    public void shouldDropTrailingZeroWhenReversed() {
        assertThat(new ReverseInteger().reverse(120)).isEqualTo(21);
    }

    @Test
    public void shouldReturnZeroForZeroInput() {
        assertThat(new ReverseInteger().reverse(0)).isEqualTo(0);
    }
}
