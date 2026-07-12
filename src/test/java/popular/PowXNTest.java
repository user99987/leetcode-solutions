package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;


public class PowXNTest {

    @Test
    public void testCase1() {
        assertThat(new PowXN().myPow(2.00000, 10)).isCloseTo(1024.0, within(0.00001));
    }

    @Test
    public void testCase2() {
        assertThat(new PowXN().myPow(2.10000, 3)).isCloseTo(9.261, within(0.00001));
    }

    @Test
    public void testCase3() {
        assertThat(new PowXN().myPow(2.00000, -2)).isCloseTo(0.25, within(0.00001));
    }
}
