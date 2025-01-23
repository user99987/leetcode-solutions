package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerTest {

    @Test
    public void testCase1() {
        assertEquals(42, new StringToInteger().myAtoi("42"));
    }

    @Test
    public void testCase2() {
        assertEquals(-42, new StringToInteger().myAtoi("   -42"));
    }

    @Test
    public void testCase3() {
        assertEquals(4193, new StringToInteger().myAtoi("4193 with words"));
    }

    @Test
    public void testCase4() {
        assertEquals(0, new StringToInteger().myAtoi("words and 987"));
    }

    @Test
    public void testCase5() {
        assertEquals(-2147483648, new StringToInteger().myAtoi("-91283472332"));
    }
}
