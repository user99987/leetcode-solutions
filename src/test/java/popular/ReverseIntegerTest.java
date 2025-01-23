package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testCase1() {
        assertEquals(321, new ReverseInteger().reverse(123));
    }

    @Test
    public void testCase2() {
        assertEquals(-321, new ReverseInteger().reverse(-123));
    }

    @Test
    public void testCase3() {
        assertEquals(21, new ReverseInteger().reverse(120));
    }

    @Test
    public void testCase4() {
        assertEquals(0, new ReverseInteger().reverse(0));
    }
}
