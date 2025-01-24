package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonotoneIncreasingDigitsTest {

    @Test
    void testCase1() {
        int n = 10;
        int expected = 9;
        assertEquals(expected, new MonotoneIncreasingDigits().monotoneIncreasingDigits(n));
    }

    @Test
    void testCase2() {
        int n = 1234;
        int expected = 1234;
        assertEquals(expected, new MonotoneIncreasingDigits().monotoneIncreasingDigits(n));
    }

    @Test
    void testCase3() {
        int n = 332;
        int expected = 299;
        assertEquals(expected, new MonotoneIncreasingDigits().monotoneIncreasingDigits(n));
    }
}
