package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ReverseIntegerTest {

    @Test
    public void testCase1() {
        assertThat(new ReverseInteger().reverse(123)).isEqualTo(321);
    }

    @Test
    public void testCase2() {
        assertThat(new ReverseInteger().reverse(-123)).isEqualTo(-321);
    }

    @Test
    public void testCase3() {
        assertThat(new ReverseInteger().reverse(120)).isEqualTo(21);
    }

    @Test
    public void testCase4() {
        assertThat(new ReverseInteger().reverse(0)).isEqualTo(0);
    }
}
