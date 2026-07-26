package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class RomanToIntegerTest {

    @Test
    public void shouldConvertSimpleAdditiveNumerals() {
        assertThat(new RomanToInteger().romanToInt("III")).isEqualTo(3);
    }

    @Test
    public void shouldConvertSubtractiveNumeralFour() {
        assertThat(new RomanToInteger().romanToInt("IV")).isEqualTo(4);
    }

    @Test
    public void shouldConvertSubtractiveNumeralNine() {
        assertThat(new RomanToInteger().romanToInt("IX")).isEqualTo(9);
    }

    @Test
    public void shouldConvertMixedNumerals() {
        assertThat(new RomanToInteger().romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    public void shouldConvertComplexSubtractiveNumerals() {
        assertThat(new RomanToInteger().romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}
