package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivideTwoIntegersTest {

    @Test
    public void testCase1() {
        assertThat(new DivideTwoIntegers().divide(10, 3)).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new DivideTwoIntegers().divide(7, -3)).isEqualTo(-2);
    }

    @Test
    public void testCase3() {
        assertThat(new DivideTwoIntegers().divide(0, 1)).isEqualTo(0);
    }

    @Test
    public void testCase4() {
        assertThat(new DivideTwoIntegers().divide(1, 1)).isEqualTo(1);
    }
}
