package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionToRecurringDecimalTest {

    @Test
    public void shouldConvertToTerminatingDecimal() {
        var numerator = 1;
        var denominator = 2;
        var converter = new FractionToRecurringDecimal();
        assertThat(converter.fractionToDecimal(numerator, denominator)).isEqualTo("0.5");
    }

    @Test
    public void shouldConvertToIntegerWhenEvenlyDivisible() {
        assertThat(new FractionToRecurringDecimal().fractionToDecimal(2, 1)).isEqualTo("2");
    }

    @Test
    public void shouldConvertToSingleDigitRepeatingDecimal() {
        assertThat(new FractionToRecurringDecimal().fractionToDecimal(2, 3)).isEqualTo("0.(6)");
    }

    @Test
    public void shouldConvertToMultiDigitRepeatingDecimal() {
        assertThat(new FractionToRecurringDecimal().fractionToDecimal(4, 333)).isEqualTo("0.(012)");
    }

    @Test
    public void shouldConvertToNonRepeatingDecimal() {
        assertThat(new FractionToRecurringDecimal().fractionToDecimal(1, 5)).isEqualTo("0.2");
    }
}

