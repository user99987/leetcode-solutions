package popular;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionToRecurringDecimalTest {

    @Test
    public void testCase1() {
        int numerator = 1;
        int denominator = 2;
        FractionToRecurringDecimal converter = new FractionToRecurringDecimal();
        assertEquals("0.5", converter.fractionToDecimal(numerator, denominator));
    }

    @Test
    public void testCase2() {
        assertEquals("2", new FractionToRecurringDecimal().fractionToDecimal(2, 1));
    }

    @Test
    public void testCase3() {
        assertEquals("0.(6)", new FractionToRecurringDecimal().fractionToDecimal(2, 3));
    }

    @Test
    public void testCase4() {
        assertEquals("0.(012)", new FractionToRecurringDecimal().fractionToDecimal(4, 333));
    }

    @Test
    public void testCase5() {
        assertEquals("0.2", new FractionToRecurringDecimal().fractionToDecimal(1, 5));
    }
}

