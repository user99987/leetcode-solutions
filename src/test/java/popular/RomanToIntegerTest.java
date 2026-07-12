package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class RomanToIntegerTest {

    @Test
    public void testCase1() {
        assertThat(new RomanToInteger().romanToInt("III")).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new RomanToInteger().romanToInt("IV")).isEqualTo(4);
    }

    @Test
    public void testCase3() {
        assertThat(new RomanToInteger().romanToInt("IX")).isEqualTo(9);
    }

    @Test
    public void testCase4() {
        assertThat(new RomanToInteger().romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    public void testCase5() {
        assertThat(new RomanToInteger().romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}
