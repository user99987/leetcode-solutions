package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowXNTest {

    @Test
    public void testCase1() {
        assertEquals(1024.0, new PowXN().myPow(2.00000, 10), 0.00001);
    }

    @Test
    public void testCase2() {
        assertEquals(9.261, new PowXN().myPow(2.10000, 3), 0.00001);
    }

    @Test
    public void testCase3() {
        assertEquals(0.25, new PowXN().myPow(2.00000, -2), 0.00001);
    }
}
