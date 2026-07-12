package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionToRecurringDecimalTest {

    @Test
    public void testCase1() {
        var numerator = 1;
        var denominator = 2;
        var converter = new FractionToRecurringDecimal();
        assertThat(converter.fractionToDecimal(numerator, denominator)).isEqualTo("0.5");
    }

    @Test
    public void testCase2() {
        assertThat(new FractionToRecurringDecimal().fractionToDecimal(2, 1)).isEqualTo("2");
    }

    @Test
    public void testCase3() {
        assertThat(new FractionToRecurringDecimal().fractionToDecimal(2, 3)).isEqualTo("0.(6)");
    }

    @Test
    public void testCase4() {
        assertThat(new FractionToRecurringDecimal().fractionToDecimal(4, 333)).isEqualTo("0.(012)");
    }

    @Test
    public void testCase5() {
        assertThat(new FractionToRecurringDecimal().fractionToDecimal(1, 5)).isEqualTo("0.2");
    }
}

