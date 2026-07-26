package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SqrtXTest {

    @Test
    public void shouldReturnExactSquareRoot() {
        assertThat(new SqrtX().mySqrt(4)).isEqualTo(2);
    }

    @Test
    public void shouldTruncateNonPerfectSquareRoot() {
        assertThat(new SqrtX().mySqrt(8)).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForZeroInput() {
        assertThat(new SqrtX().mySqrt(0)).isEqualTo(0);
    }

    @Test
    public void shouldHandleIntegerMaxValueWithoutOverflow() {
        assertThat(new SqrtX().mySqrt(Integer.MAX_VALUE)).isEqualTo(46340);
    }
}
