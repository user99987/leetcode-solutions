package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void testCase1() {
        assertEquals(3, new RomanToInteger().romanToInt("III"));
    }

    @Test
    public void testCase2() {
        assertEquals(4, new RomanToInteger().romanToInt("IV"));
    }

    @Test
    public void testCase3() {
        assertEquals(9, new RomanToInteger().romanToInt("IX"));
    }

    @Test
    public void testCase4() {
        assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
    }

    @Test
    public void testCase5() {
        assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
    }
}
